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
import service.BranchServiceImpl;
import service.EcResult;
import service.FieldServiceImpl;
import service.SubjectServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/branch")
@Configuration
@ComponentScan("service") 
public class BranchController {
 @Autowired
 BranchServiceImpl branchService;
 @RequestMapping(value="/getAllBranch",headers="Accept=application/json")
 public List<Branch> getAllSubject(HttpSession hs){
	  
  return branchService.getBranchList();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult AddBranch( @RequestBody Branch branch,HttpSession hs){
	  EcResult ecr = new EcResult();
	 System.out.println(branch.getBranchCode()+""+branch.getName());
	  ecr.setStatus(branchService.addBranch(branch));
	  return ecr;
 }

  @RequestMapping(value="/update",headers="Accept=application/json")
  public EcResult UpdateBranch( @RequestBody Branch branch,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(branchService.updateBranch(branch));
	  return ecr;
 }


}
