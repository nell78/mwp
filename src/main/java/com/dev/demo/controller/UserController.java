package com.dev.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.demo.mapper.UserMapper;

@Controller
@RequestMapping("/user/*")
public class UserController {

	@Autowired
	UserMapper testMapper;

	@GetMapping("/info")
	public List<Map<String, Object>> info() {
		return testMapper.info();
	}
}
