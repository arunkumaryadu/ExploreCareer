package controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.CrossOrigin;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import model.Branch;
import model.Expert;
import model.Subject;
import model.Users;
import service.EcResult;
import service.ExpertService;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;
import service.UserServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/expert")
@Configuration
@ComponentScan("service") 
public class ExpertController {
 @Autowired
 ExpertService expertService;
 @RequestMapping(value="/getAllExpert",headers="Accept=application/json")
 public List<Expert> getAllSubject(HttpSession hs){
	  
  return expertService.showAllExpert();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddExpert( @RequestBody Expert expert,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(expertService.addExpert(expert));
	  return ecr;
 }
  
}
