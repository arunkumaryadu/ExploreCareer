package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Stream;
import model.Subject;
import service.StreamInterface;
@Repository
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
		
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		try {
			Stream s1=(Stream) y.get(Stream.class, stream.getStreamName());
			if(s1!=null)
				return 2;
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
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteStream(Stream stream) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Subject showStream(Stream stream) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
