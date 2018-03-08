package com.wdx.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {


	@RequestMapping("/")
	public String index(HttpServletRequest request,Model model){
		
//		ExecuteResult<UserInfo> userResult = userService.getUserInfoBySesssion(request);
//		if(userResult.isSuccess()){
//			model.addAttribute("userInfo", userResult.getResult());
//			return "home";
//		}
		return "home";
	}

}
