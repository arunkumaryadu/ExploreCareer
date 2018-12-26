package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Branch;
import model.EntranceExam;
import service.EntranceExamInterface;
@Repository
public class EntranceExamDaoImpl implements EntranceExamInterface {

	@Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 } 
	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return sessionFactory!=null;
	}
	 
	public List<EntranceExam> getExamList() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Criteria criteria = session.createCriteria(EntranceExam.class);
		List<EntranceExam>list= (List<EntranceExam>) criteria.list();
		session.close();
		return list;
	}
		
		 
	public List<EntranceExam> getExamListByFieldName(String fieldName) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Criteria criteria = session.createCriteria(EntranceExam.class);
		criteria.add(Restrictions.eq("fieldName",fieldName));
		List<EntranceExam>list= (List<EntranceExam>) criteria.list();
		session.close();
		return list;
	}
	public int addExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			EntranceExam exam1 = (EntranceExam) session.get(EntranceExam.class, exam.getName());
		 if(exam1!=null)
			 return 2;
		 session.save(exam);
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

	public int updateExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			EntranceExam exam1= (EntranceExam) session.get(EntranceExam.class, exam.getName());
			if(exam1==null)
			 {
			 session.close();
			 return 2;
			 }
		  exam1.setDetails(exam.getDetails());
		  exam1.setExamDate(exam.getExamDate());
		  exam1.setFieldName(exam.getFieldName());
		  exam1.setLink(exam.getLink());
		 session.update( exam1);
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

	public int deleteExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			EntranceExam exam1= (EntranceExam) session.get(EntranceExam.class, exam.getName());
			if(exam1==null)
			 {
			 session.close();
			 return 2;
			 }
		 session.delete(exam1);
		   trans.commit();}
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

	public EntranceExam findExamByName(String name) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
			EntranceExam exam1= (EntranceExam) session.get(EntranceExam.class, name);
			session.close();
	return exam1;

}
	
}
