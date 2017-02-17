package com.jero.motelmall.service.user;

import java.util.List;

import com.jero.motelmall.po.user.LogInfo;


public interface ILogInfoService {
	
	int addInfo(LogInfo logInfo);

	int deleteInfoById(LogInfo logInfo);

	int updateInfoByName(LogInfo logInfo);

	List<LogInfo> selectAll();

}
