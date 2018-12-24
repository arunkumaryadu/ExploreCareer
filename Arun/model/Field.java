package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
@Entity
@Table
public class Field implements Serializable {
	@Id
	private String fieldName;
	private String link;
	private String details1;
	private String details2;
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "Field_Stream", joinColumns = { @JoinColumn(name = "fieldName") }, inverseJoinColumns = { @JoinColumn(name = "streamName") })
	private	Collection<Stream> streams=new ArrayList<Stream>();
	
	public Field() {
		// TODO Auto-generated constructor stub
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
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
	public Collection<Stream> getStreams() {
		return streams;
	}
	public void setStreams(Collection<Stream> streams) {
		this.streams = streams;
	}
	
	
	

}
