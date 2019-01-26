
package controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import model.Stream;
import service.EcResult;
import service.StreamServiceImpl;



@CrossOrigin
@EnableWebMvc
@RestController
@RequestMapping("/stream")
@Configuration
@ComponentScan("service") 
public class StreamController {
 @Autowired
 StreamServiceImpl streamService;
 @RequestMapping(value="/getAllStream",headers="Accept=application/json")
 public List<Stream> getAllStream(HttpSession hs){
	 Stream st=new Stream();
	 Stream st1=new Stream();
	 Stream st2=new Stream();
	 List<Stream> ls=streamService.getStreamList();//new ArrayList<Stream>();
	 
  return ls;//streamService.getStreamList();
 }  
 /*
  * @RequestMapping(value="/getAllSubject",headers="Accept=application/json")
 public List<Subject> getAllSubject(HttpSession hs){
	  
  return subjectService.getSubjectList();
 }

  * */
 
 
 @RequestMapping(value="/add",headers="Accept=application/json",produces = "application/json")
 


 
  public EcResult AddSubject(  @RequestBody Stream stream ,HttpSession hs){
	  EcResult ecr = new EcResult();
	  ecr.setStatus(streamService.addStream(stream));
	  return ecr;
 }
	}
