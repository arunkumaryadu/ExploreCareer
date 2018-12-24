package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.FieldDaoImpl;
import dao.StreamDaoImpl;
import dao.SubjectDaoImpl;
import model.Field;
import model.Stream;
import model.Subject;
@Service
public class FieldServiceImpl implements FieldInterface{

	@Autowired
	private static  FieldDaoImpl objFieldDaoImol;

	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return objFieldDaoImol.checkConfiguration();
	}

	public int addField(Field field) {
		
		return objFieldDaoImol.addField(field);
	}

	public int updateField(Field field) {
		
		return objFieldDaoImol.updateField(field);
	}

	public int deleteField(Field field) {
		// TODO Auto-generated method stub
		return objFieldDaoImol.deleteField(field);
	}

	public Field showField(Field field) {
		
		return objFieldDaoImol.showField(field);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		FieldDaoImpl objFieldDaoImol=contex.getBean(FieldDaoImpl.class);
		StreamDaoImpl objStreamDaoImol=contex.getBean(StreamDaoImpl.class);
		/*
		 * Add data on field
		 * 
		Field f1=new Field();
		f1.setFieldName("Engineering");
		f1.setDetails1("Engineering kr le Ek baar fir to aish hi aish hai");
		f1.setDetails2("Engineering kuchh sikhaye na sikhaye jindagi jina sikha deti hai");
		f1.setLink("EngineeringLink");
		

		Field f2=new Field();
		f2.setFieldName("MBBS");
		f2.setDetails1("Ladki achhi milegi");
		f2.setDetails2("padh padh ke dimag ka dahi ho jayega");
		f2.setLink("MBBS_Link");
		
		Field f3=new Field();
		f3.setFieldName("Bsc");
		f3.setDetails1("Ghanta kuchh ni hone wala");
		f3.setDetails2("padhne ka bhi koi fayda ni IAS to nikal ni payega");
		f3.setLink("Bsc_Link");
		
		Stream st1=new Stream();
		st1.setStreamName("PCM");
		st1.setLink("PCM_LInk");
		st1.setScope("Future very very bright hai");
		
		Stream st2=new Stream();
		st2.setStreamName("PCB");
		st2.setLink("PCB_LInk");
		st2.setScope("Future very bright hai bus padhna padega");

		st1.getFields().add(f1);
		st1.getFields().add(f2);
		st1.getFields().add(f3);
		
		st2.getFields().add(f2);
		st2.getFields().add(f3);
		
		f1.getStreams().add(st1);
		f2.getStreams().add(st2);
	    f3.getStreams().add(st1);
	    f3.getStreams().add(st2);
	    
	    objStreamDaoImol.addStream(st1);
	    objStreamDaoImol.addStream(st2);
	    
	    objFieldDaoImol.addField(f1);
	    objFieldDaoImol.addField(f2);
	    objFieldDaoImol.addField(f3);
*/
		
	/* 
	 *  display Field 
	 * 	
	 
		Field f4=new Field();
		f4.setFieldName("ff");
		Field f5=objFieldDaoImol.showField(f4);
		if(f5!=null) {
			Collection<Stream> l1=f5.getStreams();
			System.out.println();
		}*/
		/*
		 *  update      // 1 issue found
		 * 
		Field f6=new Field();
		f6.setFieldName("MBBS");
		f6.setLink("Link updated");
		Stream st2=new Stream();
		Subject sb=new Subject();
		sb.setName("Bio");
		sb.setName("Dard Subject hai ye");
		st2.getSubject().add(sb);
		f6.getStreams().add(st2);
		int i=objFieldDaoImol.updateField(f6);
		System.out.println(i);*/
		
		/*
		 * delete
		 * 
		 * 
		 * 
		Field f6=new Field();
		f6.setFieldName("MBBS");
		int i=objFieldDaoImol.updateField(f6);
		System.out.println(i);
		*/
	}
	

}
