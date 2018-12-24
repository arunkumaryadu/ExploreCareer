package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Field;
import service.FieldInterface;

@Repository
public class FieldDaoImpl implements FieldInterface{

	
	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }

	public boolean checkConfiguration() {
		
		return sessionFactory!=null;
	}

	public int addField(Field field) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		try {
			Field s1=(Field) y.get(Field.class, field.getFieldName());
			if(s1!=null) {
				y.close();
				return 2;
				}
			y.save(field);
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

	public int updateField(Field field) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
	
		Field s1=(Field) y.get(Field.class, field.getFieldName());
		if(s1==null) {
			y.close();
			return 2;
			}
		try {
			s1.setDetails1(field.getDetails1());
			s1.setDetails2(field.getDetails2());
			s1.setLink(field.getLink());
			s1.setStreams(field.getStreams());
			y.update(s1);
			t.commit();
		} catch (Exception e) {
			return 0;
		}
		finally {
			y.close();
		}

		return 1;
	}

	public int deleteField(Field field) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		Field s1=(Field) y.get(Field.class, field.getFieldName());
		if(s1==null) {
			y.close();
			return 2;
			}
			y.delete(s1);
			t.commit();				
			y.close();		
		  return 1;
	}

	public Field showField(Field field) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		Field s1=(Field) y.get(Field.class, field.getFieldName());	
		y.close();
		return s1;	
	}
}
