package service;

public class EcResult {
	int status;
	String details;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
		if(status==0)
			this.details="Some Internal Error , Please Try After Some Time !!";
		else if(status==1)
			this.details="Successful";
		else if(status==2)
			this.details="Please give Correct Input";
		else 
			this.details="undefind Error";
	}
	

}
