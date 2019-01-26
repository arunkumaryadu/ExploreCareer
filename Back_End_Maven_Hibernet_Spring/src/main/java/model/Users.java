package model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="USER_TYPE",discriminatorType=DiscriminatorType.STRING)
public class Users
{
	
	public String userName;
	@Id
	public String emailId;
	public String passWord;
	public int phoneNumber;
	public int standard;
	//Added by ujjwal
	public String TypeOfUser;
	
	
	public String getTypeOfUser() {
		return TypeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		TypeOfUser = typeOfUser;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getEmailid() {
		return emailId;
	}
	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}
	public int getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phoneNumber = phonenumber;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getPassword() {
		return passWord;
	}
	public void setPassword(String password) {
		this.passWord = password;
	}
	@Override
	public String toString() {
		return "User [username=" + userName + ", emailid=" + emailId + ", password=" + passWord + ", phoneNumber="
				+ phoneNumber + ", standard=" + standard + "]";
	}
	
}