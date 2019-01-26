package service;

import java.util.List;

import model.Branch;
import model.Users;

public interface UserInterFace
{
	public boolean checkConfiguration();
	public int registerUser(Users user);
	public Users loginUser(Users user);
	public int updateUser(Users user);
	public int deleteUser(Users user);
	public Users searchUserByEmail(String emailid);
	public List<Users> getUserList();
	
	

}

