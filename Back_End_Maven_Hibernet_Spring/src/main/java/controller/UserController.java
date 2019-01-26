package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.CrossOrigin;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import model.Branch;
import model.Subject;
import model.Users;
import service.EcResult;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;
import service.UserServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/user")
@Configuration
@ComponentScan("service") 
public class UserController {
 @Autowired
 UserServiceImpl userService;
 @RequestMapping(value="/getAllUsers",headers="Accept=application/json")
 public List<Users> getAllSubject(HttpSession hs){
	  
  return userService.getUserList();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddUser( @RequestBody Users user,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(userService.registerUser(user));
	  return ecr;
 }

  @RequestMapping(value="/login",headers="Accept=application/json")
  public Users loginUser( @RequestBody Users user,HttpSession hs){
	  return userService.loginUser(user);
 }

}
