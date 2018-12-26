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
		return examDao.checkConfiguration();
	}

	public List<EntranceExam> getExamList() {
		// TODO Auto-generated method stub
		return examDao.getExamList();
	}

	public int addExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return examDao.addExam(exam);
	}

	public int updateExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return examDao.updateExam(exam);
	}

	public int deleteExam(EntranceExam exam) {
		// TODO Auto-generated method stub
		return examDao.deleteExam(exam);
	}

	public EntranceExam findExamByName(String name) {
		// TODO Auto-generated method stub
		return examDao.findExamByName(name);
	}
	public List<EntranceExam> getExamListByFieldName(String fieldName) {
		// TODO Auto-generated method stub
		return examDao.getExamListByFieldName(fieldName);
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
		 exam.setLink("exam.com");
		 examDao.addExam(exam);
		 EntranceExam exam1 = new EntranceExam();
		 exam1.setExamDate(new Date());
		 exam1.setName("B");
		 exam1.setDetails("B EXAM???");
		 exam1.setFieldName("Med");
		 exam1.setLink("exam.com");
		 examDao.addExam(exam1);
		 EntranceExam exam2 = new EntranceExam();
		 exam2.setExamDate(new Date());
		 exam2.setName("C");
		 exam2.setDetails("C EXAM???");
		 exam2.setFieldName("Med");
		 exam2.setLink("exam.com");
		 examDao.addExam(exam2);
		 List<EntranceExam>l = examDao.getExamListByFieldName("Med");
		 for (EntranceExam entranceExam : l) {
			System.out.println(entranceExam);
		}
		 
		/* examDao.updateExam(exam);
		// examDao.deleteExam(exam);
		 List<EntranceExam>l = examDao.getExamList();
		 for (EntranceExam entranceExam : l) {
			System.out.println(entranceExam);
		}
		
		 EntranceExam exam1 =examDao.findExamByName("A");
		 System.out.println(exam1);*/
		 
		 
	}

	
	
}
