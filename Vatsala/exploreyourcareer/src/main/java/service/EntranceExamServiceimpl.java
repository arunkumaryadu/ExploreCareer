package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import dao.EntranceExamDaoImpl;
import model.EntranceExam;
@Service
public class EntranceExamServiceimpl  implements EntranceExamInterface{
  
	@Autowired
	static EntranceExamDaoImpl examDao;
	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<EntranceExam> getExamList() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return 0;
	}

	public EntranceExam findExamByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 examDao=contex.getBean(EntranceExamDaoImpl.class);
		 EntranceExam exam = new EntranceExam();
		 exam.setExamDate(new Date());
		 exam.setName("A");
		 exam.setDetails("A EXAM???");
		 exam.setFieldName("Engg");
		
		 examDao.addExam(exam);
		 exam.setLink("exam.com");
		 examDao.updateExam(exam);
		// examDao.deleteExam(exam);
		 List<EntranceExam>l = examDao.getExamList();
		 for (EntranceExam entranceExam : l) {
			System.out.println(entranceExam);
		}
		
		 EntranceExam exam1 =examDao.findExamByName("A");
		 System.out.println(exam1);
		 
		 
	}
}
