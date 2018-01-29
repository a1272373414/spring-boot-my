package com.tangj.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tangj.springboot.domain.Student;
import com.tangj.springboot.domain.User;
import com.tangj.springboot.property.NeoProperties;
import com.tangj.springboot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger log = LoggerFactory.getLogger(UserController.class);// 日志

	@Autowired
	private NeoProperties neoProperties;

	@Autowired
	private UserService userService;

	@RequestMapping("getAll")
	@ResponseBody
	public Object getAll() {
		/** 使用自定义配置的属性 **/
		System.out.println("--------------" + neoProperties.getTitle());
		
		Student student = userService.selectByPrimaryKey(1l);
		log.info("获取user");
		return student;
	}

}
