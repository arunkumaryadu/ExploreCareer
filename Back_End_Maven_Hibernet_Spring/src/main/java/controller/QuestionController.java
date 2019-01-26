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
import model.Expert;
import model.Question;
import model.Subject;
import model.Users;
import service.EcResult;
import service.ExpertService;
import service.FieldServiceImpl;
import service.QuestionService;
import service.SubjectServiceImpl;
import service.UserServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/question")
@Configuration
@ComponentScan("service") 
public class QuestionController {
 @Autowired
 QuestionService questionService;

  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult addQuestion( @RequestBody Question question,HttpSession hs){
	  System.out.println("Ujjwal1");
	  EcResult ecr = new EcResult();
	  ecr.setStatus(questionService.askQuestion(question));
	  return ecr;
 }
  @RequestMapping(value="/update",headers="Accept=application/json")
  public EcResult addAnswer( @RequestBody Question Q,HttpSession hs){
	  EcResult ecr = new EcResult();
	  System.out.println("i am update que");
	  System.out.println(Q.getId());
	  System.out.println(Q.getAnswer());
	  ecr.setStatus(questionService.addAnswer(Q));
	  return ecr;
 }
  @RequestMapping(value="/unansweredQuestion",headers="Accept=application/json")
  public List<Question> displayMyQuestions(HttpSession hs){
 	  
   return questionService.unAnsweredQuestion();
  }
  
  @RequestMapping(value="/answeredQuestion",headers="Accept=application/json")
  public List<Question> answeredQuestion(HttpSession hs){
 	  
   return questionService.answeredQuestion("exploreCareer@gmail.com");
  }/*
  @RequestMapping(value="/unAnsweredQuestion",headers="Accept=application/json")
  public List<Question> unAnsweredQuestion(HttpSession hs){
 	  
   return questionService.unAnsweredQuestion();
  }*/
	}
