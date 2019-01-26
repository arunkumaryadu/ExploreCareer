package dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import model.Expert;
import service.ExpertInterface;
@Repository
@Configuration
@ComponentScan("config")
public class ExpertDao implements ExpertInterface {
	
	@Autowired
	 private SessionFactory sessionFactory; 
	
	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }

	public int addExpert(Expert expert) {
		
		Session y =sessionFactory.openSession();
		System.out.println(2);
		Transaction t = y.beginTransaction();
		System.out.println(3);
		y.save(expert);
		t.commit();
		y.close();
		return 0;
	}

	public int removeExpert(String s) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		
		try
			{Expert User1=(Expert) y.get(Expert.class,s);
			if(User1==null)
				 return 2;
			y.delete(User1);
			t.commit();
			}
		 catch 
			(Exception e) 
			{
				e.printStackTrace();
				return 0;
			}
			finally
			{
				y.close();
			}
			return 1;
		
		
	}

	public int updateExpert(Expert Expert) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		
		try {
			Expert User1 = (Expert) y.get(Expert.class,Expert.getEmailid());
			 if(User1==null)
				 return 2;
			 
			 //User1.setUsername(user.getUsername());
			 User1.setPhonenumber(Expert.getPhonenumber());
			 User1.setPassword(Expert.getPassword());
			 User1.setExpertSalary(Expert.getExpertSalary());
			 y.update(User1);
		
		 t.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return 0;
		}
		finally
		{
		y .close();
		}
		return 1;
		
	}

	public List showAllExpert() {
		
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		
		Criteria c=y.createCriteria(Expert.class);
		c.add(Restrictions.eq("TypeOfUser", "Expert"));
		
		List<Expert>  results = (List<Expert>)c.list();
		
	return results;
	}

	public Expert showSingleExpert(String s) {
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
	
		
		try {
			
			Expert e = (Expert) y.get(Expert.class,s);
			
			 if(e==null)
				 return null;
		
			 System.out.println(4);
				//System.out.println(e.getUsername());
				e.getUsername();
				e.getExpertIn();
				e.getExpertSalary();
				e.getPhonenumber();
				e.getEmailid();
			
				System.out.println(3);
			//y.save(s);
			System.out.println(1);
			//t.commit();
			//y.close();
			System.out.println(2);
			return e;
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("No such Email ID found ");
		}
		finally {
			y.close();
		}
		return null;
	}
	
	 public void f1() {
			System.out.println(sessionFactory==null);
	 }
}