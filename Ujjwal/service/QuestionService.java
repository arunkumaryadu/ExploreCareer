package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Service;

//import antlr.collections.List;
import config.HibernateConfig;
import dao.QuestionDao;

import model.Question;

@Service
public class QuestionService implements QuestionInterface {
	
	@Autowired
	static QuestionDao QuestionDao;
	
	
	public int  askQuestion(Question Q) {
		 return QuestionDao.askQuestion(Q);
		
		
	} 
	
	public  List displayMyQuestions(String a) {
		return (List) QuestionDao.displayMyQuestions(a);
		
	}
	
	
	public List unAnsweredQuestion() {
		return (List) QuestionDao.unAnsweredQuestion();
	}
	
	
	public List answeredQuestion(String a) {
		return (List) QuestionDao.answeredQuestion(a);
	}
	
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 QuestionDao=contex.getBean(QuestionDao.class);
		 QuestionDao.f1();
		 System.out.println(1);
		 //ASK QUESTION
		 Question Q=new Question();
		 Q.setQuestion("what is qql");
		 Q.setRelatedAreaOfQuestion("qlqlql:");
		 Q.setAskerEmail("adrg@gmail.com");
		 Q.setAskerName("afsdvaaf");
		 //Q.setDate(date);
		 int a=QuestionDao.askQuestion(Q);
		 
		 
		
		 List l= (List) QuestionDao.displayMyQuestions("aaa@gmail.com") ;
		 
		 for(Object q:l) {
			 /*System.out.println(((Question) q).getId());
			 System.out.println(((Question) q).getAskerEmail());
			 System.out.println(((Question) q).getReplierEmail());
			 System.out.println(((Question) q).getAskerName());
			 System.out.println(((Question) q).getQuestion());
			 System.out.println(((Question) q).getRelatedAreaOfQuestion());
			*/
			 System.out.println(((Question) q).getId());
			 System.out.println(((Question) q).getQuestion());
		 }
		 List l1= (List) QuestionDao.unAnsweredQuestion();
		 
		 for(Object q:l1) {
			 System.out.println(((Question) q).getId());
			
		 }
		 
		 List l2= (List)QuestionDao.answeredQuestion("bbb@gmail.com");
		 for(Object q:l2) {
		 System.out.println(((Question) q).getId());
		 }
		 
	}
}
