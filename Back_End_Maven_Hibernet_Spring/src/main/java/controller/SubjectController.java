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
import service.EcResult;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/subject")
@Configuration
@ComponentScan("service") 
public class SubjectController {
 @Autowired
SubjectServiceImpl subjectService;
 @RequestMapping(value="/getAllSubject",headers="Accept=application/json")
 public List<Subject> getAllSubject(HttpSession hs){
	  
  return subjectService.getSubjectList();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddSubject( @RequestBody Subject sub,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(subjectService.addSubject(sub));
	  return ecr;
 }

  @RequestMapping(value="/update",headers="Accept=application/json")
  public EcResult UpdateSubject( @RequestBody Subject sub,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(subjectService.updateSubject(sub));
	  return ecr;
 }

}
