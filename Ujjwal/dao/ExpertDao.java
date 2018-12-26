package dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import model.Expert;
import service.ExpertInterface;
@Repository
public class ExpertDao implements ExpertInterface {
	
	@Autowired
	 private SessionFactory sessionFactory; 
	
	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }

	public int addExpert(Expert Expert) {
		
		Session y =sessionFactory.openSession();
		System.out.println(2);
		Transaction t = y.beginTransaction();
		System.out.println(3);
		y.save(Expert);
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
		
		
		
		/*String hql = "UPDATE Employee set salary = :salary "  + 
             "WHERE id = :employee_id";
			Query query = session.createQuery(hql);
			query.setParameter("salary", 1000);
			query.setParameter("employee_id", 10);
			int result = query.executeUpdate();
			System.out.println("Rows affected: " + result);
*/
		
		
	}

	public List showAllExpert() {
		
		Session y =sessionFactory.openSession();
		Transaction t = y.beginTransaction();
		
		Criteria c=y.createCriteria(Expert.class);
		c.add(Restrictions.eq("TypeOfUser", "Expert"));
		
		List<Expert>  results = (List<Expert>)c.list();
		
		/*
		 *  
      try {
         tx = session.beginTransaction();
         List  = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator1 = employees.iterator(); iterator1.hasNext();){
            Employee employee = (Employee) iterator1.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary());
            List certificates = employee.getCertificates();
            for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();){
               Certificate certName = (Certificate) iterator2.next(); 
               System.out.println("Certificate: " + certName.getName()); 
            }
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
		 * */
	
		
	
	
		
		
		
		
		// TODO Auto-generated method stub
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
