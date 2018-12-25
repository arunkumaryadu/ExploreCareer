package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.EntranceExam;
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
	public List<Stream> getStreamList() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		 Query qry = session.createQuery("from  Stream");
		 List list=qry.list();
		return list;
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
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			Stream stream1= (Stream) session.get(Stream.class, stream.getStreamName());
		 if(stream1==null)
			 return 2;
		  stream1.setScope(stream.getScope());
		  stream1.setLink(stream.getLink());
		  
		 session.update( stream1);
		 trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}

	public int deleteStream(Stream stream) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			Stream stream1= (Stream) session.get(Stream.class, stream.getStreamName());
		 if(stream1==null)
			 return 2;
		 session.delete(stream1);
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}

	public Stream showStream(Stream stream) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Stream stream1= (Stream) session.get(Stream.class, stream.getStreamName());
		return stream1;
	}

	

}