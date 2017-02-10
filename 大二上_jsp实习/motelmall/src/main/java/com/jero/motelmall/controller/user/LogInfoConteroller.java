package com.jero.motelmall.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jero.motelmall.po.user.LogInfo;
import com.jero.motelmall.service.user.ILogInfoService;



@Controller
@RequestMapping(value = "loginfo")
public class LogInfoConteroller {
	@Autowired
	private ILogInfoService logService;

	@RequestMapping(value = "/selectInfo")
	public ModelAndView selectLog() {
		ModelAndView mv = new ModelAndView();
		List<LogInfo> list = logService.selectAll();
		mv.addObject("list", list);
		mv.setViewName("/user/ShowLog");
		return mv;

	}
	@RequestMapping(value = "loginfo")
	public void deleteInfoById(){
		
	}
}
