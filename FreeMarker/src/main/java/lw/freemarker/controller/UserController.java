package lw.freemarker.controller;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lw.freemarker.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/user")
@Controller


public class UserController {
	
	@RequestMapping("/getuser")
	public ModelAndView getUser(){
		User user=new User();
//		user.setEmail("111@qq.com");
		user.setName("liuwu");
		user.setId(1);		
		user.setEmail("<font color=  \"red\"> 我是谁，我从哪里来</font>");
		ModelAndView modle=new ModelAndView("userinfo");
		modle.addObject("user", user);
		return modle;
	}
	
	
	@RequestMapping("/var")
	public ModelAndView test(){
		ModelAndView modle=new ModelAndView("var");		
		modle.addObject("Long", 1000);
		modle.addObject("Double", 10.0);
		modle.addObject("String", "Hello");
		modle.addObject("Date", new Date());
		modle.addObject("Null", null);
		modle.addObject("boolean", true);		
		
		return modle;
	}
	
	
	
	
	/*****
	 * 
	 * 方法功能：用来测试结合List和Set的问题
	 *
	 * 创建者:lw
	 * 2017年9月6日 
	 *
	 * 注意:
	 * 测试:
	 */
@RequestMapping("/getlist")
   public ModelAndView testObject(){
	   ModelAndView modle=new ModelAndView("var1");
	   List<String> list =new ArrayList<String>();
	   list.add("a");
	   list.add("b");
	   list.add("c");
	   
	   
//	   使用map集合来存储对象数据
	   Map<String,String> map=new ConcurrentHashMap<String, String>();
	   map.put("LastName", "Liu");
	   map.put("FirstName", "wu");
	   
	   modle.addObject("list", list);
	   modle.addObject("mymap",map);
	   return modle;
   }


@RequestMapping("/str")
public ModelAndView testStr(){
	  //freemarker的映射的关系。
	  ModelAndView view=new ModelAndView("str");
	  
	  return view;
}



@RequestMapping("/sort")
public ModelAndView testSort(){
	  ModelAndView view=new ModelAndView("sort");
	  view.addObject("sort_init", new SortMethod());
	  
	  return view;
}


}
