
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
import model.Notice;
import model.Stream;
import model.Subject;
import service.EcResult;
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
  @RequestMapping(value="/getAllField",headers="Accept=application/json")
 public List<Field> checkConfiguration(HttpSession hs){
	  
  return fieldService.getFieldList();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddSubject( @RequestBody Field field,HttpSession hs){
	  EcResult ecr = new EcResult();	  
	  ecr.setStatus(fieldService.addField(field));
	  return ecr;
 }
  @RequestMapping(value="/update",headers="Accept=application/json")
  public EcResult updateField( @RequestBody Field field,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(fieldService.updateField(field));
	  return ecr;
  }
  /*
  @RequestMapping(value="/getAllStream",headers="Accept=application/json")
  public List<Field> getAllStream(HttpSession hs){
 	  
   return fieldService.getFieldList();
  }  */
  
	}










