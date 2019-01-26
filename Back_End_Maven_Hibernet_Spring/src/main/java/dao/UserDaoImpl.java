package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import model.Branch;
import model.Users;
import service.UserInterFace;

@Repository
@Configuration
@ComponentScan("config")
public class UserDaoImpl implements UserInterFace
{

	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession()
	 {
		  return sessionFactory.getCurrentSession();
	}
	
	 public boolean checkConfiguration()
	 {
			return sessionFactory!=null;
	 }

	public int registerUser(Users user)
	{
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			 Users User1 = (Users) session.get(Users.class,user.getEmailid());
			 if(User1!=null)
				 return 2;
			 session.save(user);
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
	
	
/*
	public int loginUser(Users user) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		try {
			Users User1 = (Users) session.get(Users.class,user.getEmailid());
			System.out.println(User1.getPassword());
			 if(User1!=null && (User1.getPassword().equals(user.getPassword())))
			 {	
				 
				 return 1;
			 }
			 
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return 0;
			}
			finally
			{
			session.close();
			}
			return 2;
	}*/
	public Users loginUser(Users user) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		try {
			System.out.println(user.getEmailid());
			Users User1 = (Users) session.get(Users.class,user.getEmailid());
			System.out.println(User1.getPassword());
			 if(User1!=null && (User1.getPassword().equals(user.getPassword())))
			 {	
				 
				 return User1;
			 }
			 
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				return new Users();
			}
			finally
			{
			session.close();
			}
			return new Users();
	}
	public int updateUser(Users user) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
			Users User1 = (Users) session.get(Users.class,user.getEmailid());
			 if(User1==null)
				 return 2;
			 
			 User1.setUsername(user.getUsername());
			 User1.setPhonenumber(user.getPhonenumber());
			 User1.setStandard(user.getStandard());
			 session.update(User1);
		
		 trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}

	
	public int deleteUser(Users user) {
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try
		{Users User1=(Users) session.get(Users.class,user.getEmailid());
		if(User1==null)
			 return 2;
		session.delete(User1);
		trans.commit();
		}
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

	public Users searchUserByEmail(String emailid) {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		Users User1=(Users) session.get(Users.class,emailid);
		return User1;
	}

	public List<Users> getUserList() {
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		 Query qry = session.createQuery("from  Users");
		 List list=qry.list();
		return list;
	}



	
}