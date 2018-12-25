package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table
public class Branch {
	@Override
	public String toString() {
		return "Branch [name=" + name + ", details1=" + details1 + ", details2=" + details2 + ", fieldName=" + fieldName
				+ "]";
	}
	@Id
	private String name;
	@Lob
	private String details1;
	@Lob
	private String details2;
	private String fieldName;
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
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

}
