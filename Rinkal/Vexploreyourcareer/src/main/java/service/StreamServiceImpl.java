package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.StreamDaoImpl;
import dao.SubjectDaoImpl;
import model.Stream;
import model.Subject;
@Service
public class StreamServiceImpl implements StreamInterface{
	@Autowired
	private static  StreamDaoImpl objStreamDaoImpl;
	public boolean checkConfiguration() {
		
		return objStreamDaoImpl.checkConfiguration();
	}

	
public static void main(String[] args) {
	
	 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
	 objStreamDaoImpl=contex.getBean(StreamDaoImpl.class);

	 
	 
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
	
	System.out.println(objStreamDaoImpl.checkConfiguration());
	System.out.println(objStreamDaoImpl.addStream(st));
	//System.out.println(objStreamDaoImol.updateStream(st));
	//System.out.println(objStreamDaoImol.deleteStream(st));
	//System.out.println(objStreamDaoImol.showStream(st));
}


public int addStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImpl.addStream(stream);
}


public int updateStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImpl.updateStream(stream);
}


public int deleteStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImpl.deleteStream(stream);
}


public Stream showStream(Stream stream) {
	// TODO Auto-generated method stub
	return objStreamDaoImpl.showStream(stream);
}


public List<Stream> getStreamList() {
	// TODO Auto-generated method stub
	return objStreamDaoImpl.getStreamList();
}
}
