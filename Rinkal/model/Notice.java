package model;




import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Notice
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int noticeId;
	private String  relatedAreaOfNotice;
	private String heading;
	private String content;
	private String link;
	private Date date;
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getRelatedAreaOfNotice() {
		return relatedAreaOfNotice;
	}
	public void setRelatedAreaOfNotice(String relatedAreaOfNotice) {
		this.relatedAreaOfNotice = relatedAreaOfNotice;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", relatedAreaOfNotice=" + relatedAreaOfNotice + ", heading=" + heading
				+ ", content=" + content + ", link=" + link + ", date=" + date + "]";
	}
	
	
	
	
	

}
