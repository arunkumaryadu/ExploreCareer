package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import config.HibernateConfig;
import model.Field;
import model.Stream;
import service.BranchServiceImpl;
import service.StreamServiceImpl;

@RestController
public class StreamController {
	@Autowired
  StreamServiceImpl streamService;
	 @RequestMapping(value="/check/", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody boolean checkConfiguration(){
	 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 streamService=contex.getBean(StreamServiceImpl.class);	
		 boolean status = streamService.checkConfiguration();
	 System.out.println(streamService.checkConfiguration());	  
  return status;
	 }
	 @RequestMapping(value="/stream/", method=RequestMethod.GET, headers="Accept=application/json")
 public @ResponseBody Stream showStream(@RequestBody Stream stream) {
	Stream streamobj= streamService.showStream(stream);
	  
	  return streamobj;
	 }
 @RequestMapping(value="/add/", method=RequestMethod.POST)
 public @ResponseBody Stream add(@RequestBody Stream stream){
		 streamService.addStream(stream);
	  return stream;
	 }
	 
	 @RequestMapping(value="/update/{name}", method=RequestMethod.PUT)
	 public @ResponseBody Stream update(@PathVariable("name") String name, @RequestBody Stream stream){
		 stream.setStreamName(name);
	 streamService.updateStream(stream);
    return stream;
 }
 
	 @RequestMapping(value="/delete/{name}", method=RequestMethod.DELETE)
	 public @ResponseBody Stream delete(@RequestBody Stream stream){
		 streamService.deleteStream(stream);
		return stream;
  
	 }
}


