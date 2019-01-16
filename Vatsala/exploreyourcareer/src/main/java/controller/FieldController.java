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
import dao.BranchDaoImpl;
import model.Branch;
import model.Field;
import model.Subject;
import service.BranchServiceImpl;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;



@RestController
public class FieldController {
 @Autowired
FieldServiceImpl fieldService;
		 
 @RequestMapping(value="/check/", method=RequestMethod.GET, headers="Accept=application/json")

 public @ResponseBody boolean checkConfiguration(){
	 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
	 fieldService=contex.getBean(FieldServiceImpl.class);	
	 boolean status = fieldService.checkConfiguration();
	 System.out.println(fieldService.checkConfiguration());	  
  return status;
 }
		 @RequestMapping(value="/subject/", method=RequestMethod.GET, headers="Accept=application/json")
		 public @ResponseBody Field showfield(@RequestBody Field field) {
			 Field fieldobj = fieldService.showField(field);
		  
		  return fieldobj;
		 }
		 
		 @RequestMapping(value="/add/", method=RequestMethod.POST)
		 public @ResponseBody Field add(@RequestBody Field field){
			 fieldService.addField(field);
		  return field;
		 }
		 
		 @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
		 public @ResponseBody Field update(@PathVariable("name") String name, @RequestBody Field field){
			 field.setFieldName(name);
			
			 fieldService.updateField(field);
		    return field;
		 }
		 
		 @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
		 public @ResponseBody Field delete(@RequestBody Field field){
			 fieldService.deleteField(field);
			return field;
		  
		 }	 
	}


