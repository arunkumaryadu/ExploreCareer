package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.StreamDaoImpl;
import dao.SubjectDaoImpl;
import model.Stream;
import model.Subject;
@Service
@Configuration
@ComponentScan("dao")
public class StreamServiceImpl implements StreamInterface{
	@Autowired
	private StreamDaoImpl objStreamDaoImol;
	public boolean checkConfiguration() {
		
		return objStreamDaoImol.checkConfiguration();
	}


public int addStream(Stream stream) {
	
	return objStreamDaoImol.addStream(stream);
}


public int updateStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImol.updateStream(stream);
}


public int deleteStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImol.deleteStream(stream);
}


public Stream showStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImol.showStream(stream);
}
public List<Stream> getStreamList(){
	return objStreamDaoImol.getStreamList();
}
/*

public static void main(String[] args) {

 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
 objStreamDaoImol=contex.getBean(StreamDaoImpl.class);

 
 
Subject subject=new Subject();
subject.setName("Science");
subject.setDetails("i hate this subject");

Subject subject1=new Subject();
subject1.setName("Scdience1");
subject1.setDetails("i hate tdffhis subject");

SubjectDaoImpl ssimpl=contex.getBean(SubjectDaoImpl.class);

ssimpl.addSubject(subject);
ssimpl.addSubject(subject1);
Stream st=new Stream();
	st.getSubject().add(subject);
st.getSubject().add(subject1);

st.setStreamName("Maths");
st.setLink("Mathslink");
st.setScope("bahut Scope hai");

System.out.println(objStreamDaoImol.checkConfiguration());
System.out.println(objStreamDaoImol.addStream(st));
//System.out.println(objStreamDaoImol.updateStream(st));
//System.out.println(objStreamDaoImol.deleteStream(st));
//System.out.println(objStreamDaoImol.showStream(st));
}
*/

}
