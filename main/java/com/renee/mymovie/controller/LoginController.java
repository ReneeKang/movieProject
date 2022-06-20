package com.renee.mymovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.renee.mymovie.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UserService userService;
	
	@GetMapping("/test")
	public String test(Model m) {
		try {
			int testCnt = userService.getCount();
			m.addAttribute("testCnt",testCnt);
			System.out.print("컨트롤러");
			System.out.print(testCnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home";
	}
	
}
