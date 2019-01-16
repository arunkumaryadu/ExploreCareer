package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import config.HibernateConfig;
import model.Question;
import model.Subject;
import service.QuestionService;
import service.SubjectServiceImpl;

@RestController
public class QuestionController {
	@Autowired
	QuestionService questionService;

	 public @ResponseBody boolean checkConfiguration(){
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 questionService=contex.getBean(QuestionService.class);	
		 boolean status = questionService.checkConfiguration();
		 System.out.println(questionService.checkConfiguration());	  
	  return status;
	 }
			 
			 @RequestMapping(value="/subject/", method=RequestMethod.GET, headers="Accept=application/json")
			 public @ResponseBody Question displayMyQuestions(@PathVariable("name") String name, @RequestBody Question question) {
				 List questionobj = questionService.displayMyQuestions(name);
			  
			  return (Question) questionobj;
			 }
			 
			 @RequestMapping(value="/add/", method=RequestMethod.POST)
			 public @ResponseBody Question add(@RequestBody Question question){
				 questionService.askQuestion(question);
			  return question;
			 }
			 
			 @RequestMapping(value="/question/", method=RequestMethod.GET, headers="Accept=application/json")
			 public @ResponseBody Question answeredQuestions(@PathVariable("name") String name, @RequestBody Question question) {
				 List questionobj = questionService.answeredQuestion(name);
			  
			  return (Question) questionobj;
			 }
			 @RequestMapping(value="/question/", method=RequestMethod.GET, headers="Accept=application/json")
			 public @ResponseBody Question unansweredQuestions(@RequestBody Question question) {
				 List questionobj = questionService.unAnsweredQuestion();
			  
			  return (Question) questionobj;
			 }
		}



