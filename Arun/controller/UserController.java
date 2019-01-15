package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import config.HibernateConfig;
import dao.UserDaoImpl;
import model.User;
import service.SubjectServiceImpl;
import service.UserServiceImpl;


@RestController
public class UserController {

	 @Autowired
	private	SubjectServiceImpl userService;
	 @RequestMapping(value="/check/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody boolean getListUser(){
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 userService=contex.getBean(SubjectServiceImpl.class);	
		 System.out.println(userService.checkConfiguration());	  
	  return userService.checkConfiguration();
	 }

}
