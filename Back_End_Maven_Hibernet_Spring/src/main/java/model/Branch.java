package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int branchCode;
	
	private String name;
	@Lob
	private String details1;
	@Lob
	private String details2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails1() {
		return details1;
	}
	public void setDetails1(String details1) {
		this.details1 = details1;
	}
	public String getDetails2() {
		return details2;
	}
	public void setDetails2(String details2) {
		this.details2 = details2;
	}
	public int getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

}