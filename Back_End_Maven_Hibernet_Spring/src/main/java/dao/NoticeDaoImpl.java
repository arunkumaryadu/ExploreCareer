package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import model.Branch;
import model.Notice;
import service.NoticeInterFace;

@Repository
@Configuration
@ComponentScan("config")
public class NoticeDaoImpl implements NoticeInterFace{

	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }
	
	 public boolean checkConfiguration() {
			// TODO Auto-generated method stub
			return sessionFactory!=null;
		}
	
	

	public int addNotice(Notice notice)
	{
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			/*Notice notice1 = (Notice) session.get(Notice.class,notice.getNoticeId());
		 if(notice1!=null)
			 return 2;*/
		 session.save(notice);
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
	
//	@SuppressWarnings("unchecked")
//	public List<Notice> showNoticeByContent(Notice notice) {
//		Session session =sessionFactory.openSession();
//		Transaction trans=session.beginTransaction();
//		
//		Query qry = session.createQuery("from  Notice");
//		 List list=qry.list();
//		return list;
//	}
 
	public int updateNotice(Notice notice) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			Notice notice1 = (Notice) session.get(Notice.class, notice.getNoticeId());
		 if(notice1==null)
			 return 2;
		 
		 notice1.setContent(notice.getContent());
		 notice1.setHeading(notice.getHeading());
		 notice1.setLink(notice.getLink());
		 notice1.setRelatedAreaOfNotice(notice.getRelatedAreaOfNotice());
		 
		 session.update(notice1);
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

	public int deleteNotice(Notice notice) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			Notice notice1 = (Notice) session.get(Notice.class, notice.getNoticeId());
			
		 if(notice1==null)
			 return 2;
		 session.delete(notice1);
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
	
	@SuppressWarnings("unchecked")
	public List<Notice> displayNoticeOrderByDate() {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Criteria criteria = session.createCriteria(Notice.class);
		criteria.addOrder(Order.asc("date"));
		List<Notice>list= (List<Notice>) criteria.list();
		
		return list;	
		}
	
	@SuppressWarnings("unchecked")
	public List<Notice> showNoticeByContent(Notice notice) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Criteria criteria = session.createCriteria(Notice.class);
		criteria.add(Restrictions.eq("content",notice.getContent()));
		List<Notice>list= (List<Notice>) criteria.list();
		return list;

	}
//	Criteria criteria = session.createCriteria(EntranceExam.class);
//	criteria.add(Restrictions.eq("fieldName",fieldName));
//	List<EntranceExam>list= (List<EntranceExam>) criteria.list();


	
	
}