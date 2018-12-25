package service;

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
		
//		Users user=new Users();
//		user.setEmailid("abca@gmail.com");
//		user.setPhonenumber(12345);
//		user.setUsername("abc");
//		user.setStandard(10);
//		user.setPassword("abc123");
//		int i=userDaoImpl.registerUser(user);
//		System.out.println(i);
//		
//		
//		Users user3=new Users();
//		user3.setEmailid("abca@gmail.com");
//		user3.setPhonenumber(12345);
//		user3.setUsername("abc");
//		user3.setStandard(10);
//		user3.setPassword("abc123");
//		int l=userDaoImpl.registerUser(user);
//		System.out.println(l);
//		
//		Users user2=new Users();
//		user2.setEmailid("def@gmail.com");
//		user2.setPhonenumber(123456);
//		user2.setUsername("def");
//		user2.setStandard(12);
//		user2.setPassword("def123");
//	int j=userDaoImpl.registerUser(user2);
//		System.out.println(j);//output 2 for successfull registration....1 already egistered.....0 internal error
		
		
//		List<Users> ls=userDaoImpl.getUserList();
//		
//		for (Users object : ls) {
//			System.out.println(object);
//		}
		
		
		Users user1=new Users();
		user1.setEmailid("abca@gmail.com");
		user1.setPassword("abc123");
		int k=userDaoImpl.loginUser(user1);
		System.out.println(k);
		if(k==2)
			System.out.println("logged in");
//		
//		
//		
		
	}

	
	
	
}