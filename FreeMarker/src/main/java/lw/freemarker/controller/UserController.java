package lw.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lw.freemarker.entity.User;


@RequestMapping("/user")
@Controller
public class UserController {
	
	@RequestMapping("/getuser")
	public ModelAndView getUser(){
		User user=new User();
		user.setEmail("111@qq.com");
		user.setName("liuwu");
		user.setId(1);		
		ModelAndView modle=new ModelAndView("userinfo");
		modle.addObject("user", user);
		return modle;
	}
	

}
