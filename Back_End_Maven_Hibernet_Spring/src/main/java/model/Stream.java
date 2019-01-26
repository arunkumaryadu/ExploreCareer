package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class Stream implements Serializable{
	@Id
	private String streamName;
	
	@Lob
	private String scope;
	@Lob
	private String link;
	
	@OneToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="Stream_Subject",joinColumns=@JoinColumn(name="SubjectId"),inverseJoinColumns=@JoinColumn(name="StreamId"))
	private	Collection<Subject> subject=new ArrayList<Subject>();
	@ManyToMany(mappedBy="streams")
	@JsonIgnore
	private List<Field> fields =new ArrayList<Field>();
	

	public String getStreamName() {
		return streamName;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	public Stream() {
		// TODO Auto-generated constructor stub
	}
	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}
	public String getScope() {
		return scope;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Collection<Subject> getSubject() {
		return subject;
	}
	public void setSubject(Collection<Subject> subject) {
		this.subject = subject;
	}
}
