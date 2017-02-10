<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/jsp/header.jsp"%>
<title>Insert title here</title>
<script type="text/javascript">
	function del() {
		var value=$("#logId").val();
		$.ajax({
			type : "post",
			url : path+"/loginfo/deleteInfoById.do",
			dataType : "json",
			data : {
				'logId' : value
			},
			success : function(res) {
					if(res>0){
						alert("删除成功！");
						window.location.reload();
					}
			},
			error : function(res) {
					alert(res);
			}
		});
	}
</script>
</head>
<body>

	<table>
		<tbody>
			<tr>
				<th>姓名</th>
				<th>地址</th>
				<th>性别</th>
				<th>电话</th>
				<th>操作</th>
			</tr>
			
			<c:forEach items="${list})" var="log">

				<tr>
					<td>${log.logName}</td>
					<td>${log.logAddress}</td>
					<td>${log.logSex}</td>
					<td>${log.logPhone}</td>
					<td>${log.logPass}</td>
					<td><a href="javascript:void(0)" onclick="del()">删除</a></td>
					<input type="text" id="logId" value="${log.logId}" />
				</tr>
				
			</c:forEach>
		
		</tbody>

	</table>


</body>
</html>