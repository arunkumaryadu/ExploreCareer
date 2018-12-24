package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.User;


@Repository
public class UserDaoImpl{

	 @Autowired
	 private SessionFactory sessionFactory;
	 
	 protected Session getSession(){
	  return sessionFactory.getCurrentSession();
	 }

	 @SuppressWarnings("unchecked")
	 public List getListUser() {
	   System.out.println("h1");
	  List l=null;
	  return l;
	 }

	 public void saveOrUpdate(User user) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		System.out.println(user.getId()+"   "+user.getName());
		y.save(user);
		t.commit();
		y.close();
		System.out.println("inserted into user table");
		
	 }

	 public void deleteUser(int id) {
	  
	 
	 }

	 public User findUserById(int id) {
	  return null;
	 }

	public void f1() {
		System.out.println(sessionFactory==null);
		
	}

}
