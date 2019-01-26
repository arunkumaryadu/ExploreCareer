package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.ExpertDao;
import model.Expert;

import model.Users;
@Service
@Configuration
@ComponentScan("dao")
public class ExpertService  implements ExpertInterface{
	
	@Autowired
	 ExpertDao expertDao;

	public int addExpert(Expert expert) {
	
		return expertDao.addExpert(expert);
	}

	public int removeExpert(String s) {
		// TODO Auto-generated method stub
		return expertDao.removeExpert(s);
	}

	public int updateExpert(Expert Expert ) {
		// TODO Auto-generated method stub
		return expertDao.updateExpert(Expert);
	}

	public List showAllExpert() {
		// TODO Auto-generated method stub
		return expertDao.showAllExpert();
	}

	public Expert showSingleExpert(String s) {
		// TODO Auto-generated method stub
		return expertDao.showSingleExpert(s);
	}
/*
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 expertDao=contex.getBean(ExpertDao.class);
		 expertDao.f1();
		 
		//ADD EXPERT
		
		Expert e=new Expert();
		e.setEmailid("expert5@123");
		e.setPhonenumber(512365);
		e.setStandard(121);
		e.setExpertIn("Engineering");
		e.setPassword("abcd123");
		e.setUsername("ujjwal"+" "+"jesani");
		e.setExpertSalary(5000.0f);
		e.setTypeOfUser("Expert");
		//int a=expertDao.addExpert(e);
		
		//DELETE EXPERT
		
		//int a1=expertDao.removeExpert("expert@123");
		//System.out.println(a1);
		
		
		
		//UPDATE EXPERT
		Expert e1=new Expert() ;
		e1.setEmailid("expert2@123");
		e1.setPhonenumber(512365);
		e1.setPassword("abcd12");
		e1.setExpertSalary(5000.0f);
		
		//int a2=expertDao.updateExpert(e1);
		
		
		//SHOW EXPERT
		
		/*List l1=expertDao.showAllExpert();
		
		for(Object q:l1) {
			System.out.print(((Expert) q).getEmailid());
			 System.out.println(((Expert) q).getUsername());
			
		}*/
		
		//SHOW SINGLE EXPERT
		/*Expert e2=expertDao.showSingleExpert("expert2@123");
		System.out.println(e2.getPassword());
	
}*/
}