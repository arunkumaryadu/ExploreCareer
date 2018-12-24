package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		 Query qry = session.createQuery("from  EntranceExam");
		 List list=qry.list();
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
			 return 2;
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
			 return 2;
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
	return exam1;

}
}
