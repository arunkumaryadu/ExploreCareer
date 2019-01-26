package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import dao.NoticeDaoImpl;
import model.Notice;
import service.NoticeInterFace;

@Service
@Configuration
@ComponentScan("dao") 
public class NoticeServiceImpl implements NoticeInterFace
{
	@Autowired
	NoticeDaoImpl noticeDaoImpl;

	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return noticeDaoImpl.checkConfiguration();
	}

	public int addNotice(Notice notice) {
		// TODO Auto-generated method stub
		System.out.println(noticeDaoImpl==null);
		return noticeDaoImpl.addNotice(notice);
	}

	public List<Notice> showNoticeByContent(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.showNoticeByContent(notice);
	}

	public int updateNotice(Notice Notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.updateNotice(Notice);
	}

	public int deleteNotice(Notice Notice) {
		// TODO Auto-generated method stub
		return noticeDaoImpl.deleteNotice(Notice);
	}

	public List<Notice> displayNoticeOrderByDate() {
		// TODO Auto-generated method stub
		return noticeDaoImpl.displayNoticeOrderByDate();
	}
/*
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		noticeDaoImpl=contex.getBean(NoticeDaoImpl.class);
		System.out.println(noticeDaoImpl.checkConfiguration());
		
//		TO INSERT
//		Notice notice=new Notice();
//		notice.setNoticeId(1);
//		notice.setContent("Engineering");
//		notice.setHeading("Last date of Frorm Filling");
//		notice.setLink("www.iitKharagpur.com");
//		notice.setRelatedAreaOfNotice("Exam form");
//		notice.setDate(new Date());
//		noticeDaoImpl.addNotice(notice);
//	List<Notice> ls=noticeDaoImpl.displayNoticeOrderByDate();
//	for(Notice x:ls)
//	{
//		System.out.println(x);
//	}
//	
		
//	TO UPDATE	
////	Notice notice1=new Notice();
////	notice1.setNoticeId(2);
////	notice1.setContent("MBBS");
////	notice1.setHeading("Seats left vacant");
////	notice1.setLink("www.medicalcollege.com");
////	notice1.setRelatedAreaOfNotice("Exam date");
////	notice1.setDate(new Date());
////	noticeDaoImpl.updateNotice(notice1);
////	List<Notice> ls=noticeDaoImpl.displayNoticeOrderByDate();
////	for(Notice x:ls)
////	{
////		System.out.println(x);
////	}
//	
	
//TO showNoticeByContent	
//		Notice notice2=new Notice();
//		notice2.setContent("MBBS");
//		
//	List<Notice> ls=noticeDaoImpl.showNoticeByContent(notice2);
//	for(Notice x:ls)
//	{
//		System.out.println(x);
//	}	

	
//TO DELETE
//		Notice notice2=new Notice();
//		notice2.setNoticeId(2);
//		noticeDaoImpl.deleteNotice(notice2);
//		List<Notice> ls=noticeDaoImpl.displayNoticeOrderByDate();
//		for(Notice x:ls)
//		{
//			System.out.println(x);
//		}
		
		
	}
*/
}