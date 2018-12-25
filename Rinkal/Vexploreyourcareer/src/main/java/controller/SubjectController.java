/*package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Subject;
import service.SubjectServiceImpl;

@RestController
public class SubjectController {
 @Autowired
		 SubjectServiceImpl subjectService;
		 
		 @RequestMapping(value="/subject/", method=RequestMethod.GET, headers="Accept=application/json")
		 public @ResponseBody List getSubjectList(){
		  List subject = subjectService.getSubjectList();
		  
		  return subject;
		 }
		 
		 @RequestMapping(value="/add/", method=RequestMethod.POST)
		 public @ResponseBody Subject add(@RequestBody Subject subject){
			 subjectService.saveOrUpdate(subject);
		  
		  return subject;
		 }
		 
		 @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
		 public @ResponseBody Subject update(@PathVariable("name") String name, @RequestBody Subject subject){
			 subject.setName(name);
		 subjectService.saveOrUpdate(subject);
		  
		  return subject;
		 }
		 
		 @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
		 public @ResponseBody Subject delete(@PathVariable("name") String name){
		  Subject subject = subjectService.findSubjectByName(name);
		  subjectService.deleteSubject(name);
		  
		  return subject;
		 }
		 
	}


*/