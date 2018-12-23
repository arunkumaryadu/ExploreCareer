package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import config.HibernateConfig;
import dao.UserDaoImpl;
import model.User;


@Service
public class UserServiceImpl{
	@Autowired
	static UserDaoImpl userDao;
	 public List getListUser() {
	  return userDao.getListUser();
	 }

	 public void saveOrUpdate(User user) {
	  userDao.saveOrUpdate(user);
	 }

	 public void deleteUser(int id) {
	  userDao.deleteUser(id);
	 }

	 public User findUserById(int id) {
	  return userDao.findUserById(id);
	 }
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 userDao=contex.getBean(UserDaoImpl.class);
		 userDao.f1(); 
		 User user=new User();
		 user.setId(12);
		 user.setName("arun");
		 userDao.saveOrUpdate(user);
	}

}
