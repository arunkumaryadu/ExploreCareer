package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Stream {
	@Id
	private String streamName;
	private String scope;
	private String link;
	@OneToMany
	private	Collection<Subject> subject=new ArrayList<Subject>();
	public String getStreamName() {
		return streamName;
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