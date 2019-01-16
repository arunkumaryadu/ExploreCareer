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
import service.BranchServiceImpl;
import service.SubjectServiceImpl;



@RestController
public class BranchController {
 @Autowired
 BranchServiceImpl branchService;

	 @RequestMapping(value="/check/", method=RequestMethod.GET, headers="Accept=application/json")
	 public @ResponseBody boolean checkConfiguration(){
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 branchService=contex.getBean(BranchServiceImpl.class);	
		 boolean status = branchService.checkConfiguration();
		 System.out.println(branchService.checkConfiguration());	  
	  return status;
	 }
		 @RequestMapping(value="/branch/", method=RequestMethod.GET, headers="Accept=application/json")
		 public @ResponseBody List getBranchList(){
		  List<Branch> branch = branchService.getBranchList();
		  
		  return branch;
		 }
		 
		 @RequestMapping(value="/add/", method=RequestMethod.POST)
		 public @ResponseBody Branch add(@RequestBody Branch branch){
			 branchService.addBranch(branch);
		  return branch;
		 }
		 
		 @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
		 public @ResponseBody Branch update(@PathVariable("name") String name, @RequestBody Branch branch){
			branch.setName(name);
			
			branchService.updateBranch(branch);
		  
		  return branch;
		 }
		 
		 @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
		 public @ResponseBody Branch delete(@PathVariable("name") String name){
		 Branch branch = branchService.findBranchByName(name);
		 branchService.deleteBranch(branch);
		  
		  return branch;
		 }
		 
	}


