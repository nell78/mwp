package com.dev.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/main")
	public String main(Model model) {
		model.addAttribute("test", "Hello, world!");
		return "main";
	}
	
	@RequestMapping("/write")
	public String write(Model model) {
		model.addAttribute("test", "Hello, world!");
		return "write";
	}	
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("template", "content/welcome");
		return "index";
	}	
}
