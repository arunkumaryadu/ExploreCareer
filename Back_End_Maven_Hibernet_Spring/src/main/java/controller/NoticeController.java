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
import model.Notice;
import model.Subject;
import service.EcResult;
import service.FieldServiceImpl;
import service.NoticeServiceImpl;
import service.SubjectServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/notice")
@Configuration
@ComponentScan("service") 
public class NoticeController {
 @Autowired
 NoticeServiceImpl noticeService;
 
 
 @RequestMapping(value="/getAllNotice",headers="Accept=application/json")
 public List<Notice> getAllNotice(HttpSession hs){
	  System.out.println("hello rinkal notice");
  return noticeService.displayNoticeOrderByDate();
 }
  @RequestMapping(value="/add",headers="Accept=application/json")
  public EcResult addNotice( @RequestBody Notice notice,HttpSession hs){
	  EcResult ecr = new EcResult();
	  System.out.println(noticeService==null);
	  ecr.setStatus(noticeService.addNotice(notice));
	  return ecr;
 }

  @RequestMapping(value="/update",headers="Accept=application/json")
  public EcResult updateNotice( @RequestBody Notice notice,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(noticeService.updateNotice(notice));
	  return ecr;
 }
  @RequestMapping(value="/delete",headers="Accept=application/json")
  public EcResult deleteNotice( @RequestBody Notice notice,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(noticeService.deleteNotice(notice));
	  return ecr;
 }
  @RequestMapping(value="/getAllNoticeCo",headers="Accept=application/json")
  public List<Notice> showNoticeByContent(@RequestBody Notice notice,HttpSession hs){
 	  
   return noticeService.showNoticeByContent(notice);
  }
  
}
