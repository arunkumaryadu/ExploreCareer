package dao;

import java.sql.SQLIntegrityConstraintViolationException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Subject;
import service.SubjectInterface;
@Repository
public class SubjectDaoImpl implements SubjectInterface{

	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }
	 public boolean checkConfiguration() {
			// TODO Auto-generated method stub
			return sessionFactory!=null;
		}
	public int addSubject(Subject subject) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		try {
			Subject s1=(Subject) y.get(Subject.class, subject.getName());
			if(s1!=null)
				return 2;
			y.save(subject);
			t.commit();			
		}
		catch(Exception e) {
			return 0;
		}
		finally {
			y.close();
		}
		
		return 1;
	}
	public int updateSubject(Subject subject) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
	
		Subject s1=(Subject) y.get(Subject.class, subject.getName());
		if(s1==null)
			return 2;
		s1.setDetails(subject.getDetails());
		y.update(s1);
		t.commit();	
		return 1;
	}
	public int deleteSubject(Subject subject) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
			Subject s1=(Subject) y.get(Subject.class, subject.getName());
			if(s1==null)
				return 2;
			y.delete(s1);
			t.commit();				
			y.close();		
		  return 1;
		
	}
	public Subject showSubject(Subject subject) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		Subject s1=(Subject) y.get(Subject.class, subject.getName());
	
		return s1;
	}
	

}
