package service;


import java.util.List;

import model.Notice;

public interface NoticeInterFace 
{
	public boolean checkConfiguration(); 
	public int addNotice(Notice notice);
	public List<Notice> showNoticeByContent(Notice notice);
	public int updateNotice(Notice Notice);
	public int deleteNotice(Notice Notice);
	public List<Notice> displayNoticeOrderByDate();
	

}
