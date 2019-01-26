package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import model.Field;
import model.Stream;
import model.Subject;
import service.StreamInterface;
@Repository
@Configuration
@ComponentScan("config")
public class StreamDaoImpl implements StreamInterface{


	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }

	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return sessionFactory!=null;
	}

	public int addStream(Stream stream) {
		System.out.println(this.sessionFactory==null);
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		System.out.println(98);
		try {
			Stream s1=(Stream) y.get(Stream.class, stream.getStreamName());
			if(s1!=null) {
				//y.close();
				return 2;
				}
			y.save(stream);
			t.commit();			
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		
		}
		finally {
			y.close();
		}

		return 1;
		}

	public int updateStream(Stream stream) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
	
		Stream s1=(Stream) y.get(Stream.class, stream.getStreamName());
		if(s1==null) {
			y.close();
			return 2;
			}
		try {
			s1.setLink(stream.getLink());
			s1.setScope(stream.getScope());
			s1.setSubject(stream.getSubject());
			s1.setFields(stream.getFields());
			
			y.update(s1);
			t.commit();
		} catch (Exception e) {
			return 0;
		}	
		return 1;
		}

	public int deleteStream(Stream stream) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		Stream s1=(Stream) y.get(Stream.class, stream.getStreamName());
			if(s1==null) {
				y.close();
				return 2;
				}
				
			y.delete(s1);
			t.commit();				
			y.close();		
		  return 1;
	}

	public Stream showStream(Stream stream) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		Stream s1=(Stream) y.get(Stream.class, stream.getStreamName());	
		y.close();
		return s1;
	}

	
	public List<Stream> getStreamList() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Criteria criteria = session.createCriteria(Stream.class);
		List<Stream>list= (List<Stream>) criteria.list();
		session.close();
		System.out.println(list.toString());
		return list;
	}
	

}
