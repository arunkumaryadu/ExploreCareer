package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
//import dao.BranchDaoImpl;
import dao.UserDaoImpl;
//import model.Branch;
import model.Users;

@Service
public class UserServiceImpl implements UserInterFace 
{

	@Autowired
	static UserDaoImpl userDaoImpl;

	
	
	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return userDaoImpl.checkConfiguration();
	}

	public int registerUser(Users user) {
		
		return userDaoImpl.registerUser(user);
	}

	public int loginUser(Users user)
	{
		return userDaoImpl.loginUser(user);
	}
	
	
	public int updateUser(Users user) {
		return userDaoImpl.updateUser(user);
	}

	public int deleteUser(Users user) {
		return userDaoImpl.deleteUser(user);
	}

	public Users searchUserByEmail(String emailid) {
		return userDaoImpl.searchUserByEmail(emailid);

	}
	
	public List<Users> getUserList() {
		
		return userDaoImpl.getUserList();
	}
	
	
	public static void main(String[] args)
	{
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 userDaoImpl=contex.getBean(UserDaoImpl.class);
		//System.out.println(userDaoImpl.checkConfiguration());
		
	
		
//FOR UPDATE
		/*Users user=new Users();
	user.setEmailid("abca@gmail.com");
	user.setPhonenumber(123);
	user.setUsername("abc");
		user.setStandard(12);
			
		int i=userDaoImpl.updateUser(user);
		System.out.println(i);
		if(i==1)
			System.out.println("updated");
		*/
		
//FOR DELETE		
//		Users user=new Users();
//		user.setEmailid("def@gmail.com");
//		
//			user.setStandard(12);
//			int i=userDaoImpl.deleteUser(user);
//			System.out.println(i);
//			if(i==1)
//				System.out.println("deleted");
		
//FOR REGISTRATION		
		Users user=new Users();
		user.setEmailid("abcaa@gmail.com");
		user.setPhonenumber(12345);
    	user.setUsername("abc");
		user.setStandard(10);
		user.setPassword("abc123");
		user.setTypeOfUser("User");
		int i=userDaoImpl.registerUser(user);
	System.out.println(i);
		if(i==2)
			System.out.println("Registered");
		else
			System.out.println("alredy registered");

		
		
		
////output 1 for successfull registration....2 already egistered.....0 internal error
		
		
		
//		Users user3=new Users();
//		user3.setEmailid("hij@gmail.com");
//		user3.setPhonenumber(1234567);
//		user3.setUsername("hij");
//		user3.setStandard(12);
//		user3.setPassword("hij123");
//		int l=userDaoImpl.registerUser(user);
//		
//		
//		Users user2=new Users();
//		user2.setEmailid("def@gmail.com");
//		user2.setPhonenumber(123456);
//		user2.setUsername("def");
//		user2.setStandard(12);
//		user2.setPassword("def123");
//	int j=userDaoImpl.registerUser(user2);
//		System.out.println(j);

		
//TO SEE USERS
//		List<Users> ls=userDaoImpl.getUserList();
//		
//		for (Users object : ls) {
//			System.out.println(object);
//		}
//		
//		
		
		
//LOGIN
//		Users user1=new Users();
//		user1.setEmailid("abca@gmail.com");
//		user1.setPassword("abc123");
//		int k=userDaoImpl.loginUser(user1);
//		System.out.println(k);
//		if(k==2)
//			System.out.println("logged in");
//		
//		
//		
		
	}

	
	
	
}



/*package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import dao.UserDaoImpl;
import model.Branch;
import model.Users;

@Service
public class UserServiceImpl implements UserInterFace 
{

	@Autowired
	static UserDaoImpl userDaoImpl;

	
	
	public boolean checkConfiguration() {
		// TODO Auto-generated method stub
		return userDaoImpl.checkConfiguration();
	}

	public int registerUser(Users user) {
		
		return userDaoImpl.registerUser(user);
	}

	public int loginUser(Users user)
	{
		return userDaoImpl.loginUser(user);
	}
	
	
	public int updateUser(Users user) {
		return userDaoImpl.updateUser(user);
	}

	public int deleteUser(Users user) {
		return userDaoImpl.deleteUser(user);
	}

	public Users searchUserByEmail(String emailid) {
		return userDaoImpl.searchUserByEmail(emailid);

	}
	
	public List<Users> getUserList() {
		
		return userDaoImpl.getUserList();
	}
	
	
	public static void main(String[] args)
	{
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 userDaoImpl=contex.getBean(UserDaoImpl.class);
		System.out.println(userDaoImpl.checkConfiguration());
		
	
		
//FOR UPDATE
//		Users user=new Users();
//	user.setEmailid("abca@gmail.com");
//	user.setPhonenumber(123);
//	user.setUsername("abc");
//		user.setStandard(12);
//		int i=userDaoImpl.updateUser(user);
//		System.out.println(i);
//		if(i==1)
//			System.out.println("updated");
		
		
//FOR DELETE		
//		Users user=new Users();
//		user.setEmailid("def@gmail.com");
//		
//			user.setStandard(12);
//			int i=userDaoImpl.deleteUser(user);
//			System.out.println(i);
//			if(i==1)
//				System.out.println("deleted");
		
//FOR REGISTRATION		
//		Users user=new Users();
//		user.setEmailid("abca@gmail.com");
//		user.setPhonenumber(12345);
//		user.setUsername("abc");
//		user.setStandard(10);
//		user.setPassword("abc123");
//		int i=userDaoImpl.registerUser(user);
//		System.out.println(i);
//		if(i==1)
//			System.out.println("Registered");
//		else
//			System.out.println("alredy registered");

		
		
		
////output 1 for successfull registration....2 already egistered.....0 internal error
		
		
		
//		Users user3=new Users();
//		user3.setEmailid("hij@gmail.com");
//		user3.setPhonenumber(1234567);
//		user3.setUsername("hij");
//		user3.setStandard(12);
//		user3.setPassword("hij123");
//		int l=userDaoImpl.registerUser(user);
//		
//		
//		Users user2=new Users();
//		user2.setEmailid("def@gmail.com");
//		user2.setPhonenumber(123456);
//		user2.setUsername("def");
//		user2.setStandard(12);
//		user2.setPassword("def123");
//	int j=userDaoImpl.registerUser(user2);
//		System.out.println(j);

		
//TO SEE USERS
//		List<Users> ls=userDaoImpl.getUserList();
//		
//		for (Users object : ls) {
//			System.out.println(object);
//		}
//		
//		
		
		
//LOGIN
//		Users user1=new Users();
//		user1.setEmailid("abca@gmail.com");
//		user1.setPassword("abc123");
//		int k=userDaoImpl.loginUser(user1);
//		System.out.println(k);
//		if(k==2)
//			System.out.println("logged in");
//		
//		
//		
		
	}

	
	
	
}*/
