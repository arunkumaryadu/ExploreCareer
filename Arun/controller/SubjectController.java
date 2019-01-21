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
  @RequestMapping(value="/login",headers="Accept=application/json")
 public List<Subject> checkConfiguration(HttpSession hs){
	  System.out.println(15);
	//  AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 Subject subject=new Subject();
		subject.setName("Maths");
		subject.setDetails("it is best sub");
	List<Subject> al=new ArrayList<Subject>();
	System.out.println(15);
	al.add(subject);
	al.add(subject);
	al.add(subject);
	al.add(subject);
  return al;
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddSubject( @RequestBody Subject sub,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(subjectService.addSubject(sub));
	  return ecr;
 }
	}
