package com.jero.motelmall.common.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

public class JsonUtil {

	private static Logger log = Logger.getLogger(JsonUtil.class);

	public static void printByJSON(HttpServletResponse response, Object obj) {
		String jsonStr = "";
		if (obj != null && !"".equals(obj)) {
			jsonStr = JSON.toJSONString(obj);
		}
		PrintWriter out = null;
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			out = response.getWriter();
			out.print(jsonStr);
			out.flush();
			log.debug("返回结果:" + jsonStr);
		} catch (IOException e) {
			log.error("responce 输出json异常!" + e);
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
}
