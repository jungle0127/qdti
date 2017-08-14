package com.qdti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qdti.dao.model.Users;
import com.qdti.service.IUsersService;

@Controller
public class UserInfoController {
	@Autowired
	@Qualifier("userService")
	private IUsersService userService;
	@RequestMapping(value="/getusers", method={RequestMethod.GET})
	public ModelAndView getUsers(ModelAndView mv,HttpSession session){
		List<Users> userList = this.userService.getAllUsers();
		mv.addObject(userList);
		mv.setViewName("main");
		return mv;		
	}
}
