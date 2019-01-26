package model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="question")
public class Question {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	 
	//@Column(name ="askerEmail",nullable=true)
	private String  askerEmail;
	 
//	@Column(name ="replierEmail",nullable=true)
	private String replierEmail;
	 
//	@Column(name ="akerName",nullable=true)
	private String askerName;
	
	//@Column(nullable=false)
	private String question;
	
	//@Column(name ="relatedAreaOfQuestion",nullable=true)
	private String relatedAreaOfQuestion;
	
	//@Column(name ="answer",nullable=true)
	private String answer;
	
	//@Column(name ="date",nullable=true)
	Date date;

	public int getId() {
		return id;
	}

	//public void setId(int id) {
	//	this.id = id;
	//}

	

	public String getAskerEmail() {
		return askerEmail;
	}

	public void setAskerEmail(String askerEmail) {
		this.askerEmail = askerEmail;
	}

	public String getReplierEmail() {
		return replierEmail;
	}

	public void setReplierEmail(String replierEmail) {
		this.replierEmail = replierEmail;
	}

	public String getAskerName() {
		return askerName;
	}

	public void setAskerName(String askerName) {
		this.askerName = askerName;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getRelatedAreaOfQuestion() {
		return relatedAreaOfQuestion;
	}

	public void setRelatedAreaOfQuestion(String relatedAreaOfQuestion) {
		this.relatedAreaOfQuestion = relatedAreaOfQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

	
	
/*	 @Column(name="name", nullable=true)
	 private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	 
}