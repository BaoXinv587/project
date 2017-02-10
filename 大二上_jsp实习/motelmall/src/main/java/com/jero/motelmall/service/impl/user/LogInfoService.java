package com.jero.motelmall.service.impl.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jero.motelmall.mapper.user.LogInfoMapper;
import com.jero.motelmall.po.user.LogInfo;
import com.jero.motelmall.service.user.ILogInfoService;


@Service
public class LogInfoService implements ILogInfoService {

	@Autowired
	private LogInfoMapper logMapper;
	
	public int addInfo(LogInfo logInfo) {
		
		return logMapper.addInfo(logInfo);
	}

	public int deleteInfoById(LogInfo logInfo) {
		
		return logMapper.deleteInfoById(logInfo);
	}


	public int updateInfoByName(LogInfo logInfo) {
		
		return logMapper.updateInfoByName(logInfo);
	}

	
	public List<LogInfo> selectAll() {
		
		return logMapper.selectAll();
	}

}
