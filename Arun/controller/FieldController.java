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
import model.Field;
import model.Subject;
import service.FieldInterface;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/field")
@Configuration
@ComponentScan("service") 
public class FieldController {
 @Autowired
 FieldServiceImpl fieldService;
  @RequestMapping(value="/displayAllField",headers="Accept=application/json")
 public List<Field> checkConfiguration(HttpSession hs){
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
  return fieldService.getFieldList();
 }
 

		 /*
		 @RequestMapping(value="/sub/", method=RequestMethod.GET, headers="Accept=application/json")
		 public Subject showSubject(@RequestParam(value = "key") String key,@RequestBody Subject subject) {
		  //Subject subjectobj = subjectService.showSubject(subject);
		  return subject;
		 }
		 
		 @RequestMapping(value="/add/", method=RequestMethod.POST)
		 public @ResponseBody Subject add(@RequestBody Subject subject){
			 subjectService.addSubject(subject);
		  return subject;
		 }
		 
		 @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
		 public @ResponseBody Subject update(@PathVariable("name") String name, @RequestBody Subject subject){
			 subject.setName(name);
			
			subjectService.updateSubject(subject);
		  
		  return subject;
		 }
		 
		 @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
		 public @ResponseBody Subject delete(@RequestBody Subject subject){
			 subjectService.deleteSubject(subject);
			return subject;
		  
		 }	 */
	}
