package com.liuhao.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/homeAction")
	public String home(){
		System.out.println("do some handling");
		return "homePage";
	}

}
