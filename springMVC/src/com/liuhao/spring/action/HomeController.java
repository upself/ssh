package com.liuhao.spring.action;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping(value="/homeAction")
	@GET
	public String home(){
		System.out.println("do some handling");
		return "homePage";
	}
	
	@RequestMapping(value="register")
	@POST
	public String registerAction(@RequestParam("uname")String uname, @RequestParam("options")String[] options, HttpServletRequest request, String name1, String sexual){
		System.out.println(uname);
		System.out.println(options[0].toString());
		System.out.println("from request:"+request.getParameter("unmae"));
		request.setAttribute("username", uname);
		name1="abner";
		sexual="male";
		return "showForm";
	}
	
	@RequestMapping(value="object")
	@POST
	public String objectAction(String name, String sexual){
		return null;
	}

}
