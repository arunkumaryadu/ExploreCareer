package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Subject;

@Repository
public class SubjectDaoImpl {

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }
   public void saveOrUpdate(Subject subject) {
		// TODO Auto-generated method stub
	   Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		System.out.println(subject.getName()+"   "+subject.getDetails());
		y.save(subject);
		t.commit();
		y.close();
		System.out.println("inserted into subject table");
	}
  public void f1() {
	  System.out.println(sessionFactory==null);
		// TODO Auto-generated method stub
		
	}
  @SuppressWarnings("unchecked")
	public List getSubjectList() {
		 System.out.println("list");
		  List l=null;
		  return l;
	}

	public void deleteSubject(String name) {
		// TODO Auto-generated method stub
		
	}

	public Subject findSubjectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
