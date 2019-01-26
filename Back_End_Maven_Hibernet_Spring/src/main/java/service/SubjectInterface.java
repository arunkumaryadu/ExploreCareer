package service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import model.Subject;

public interface SubjectInterface {
	public boolean checkConfiguration(); 
	public int addSubject(Subject subject);
	public int updateSubject(Subject subject);
	public int deleteSubject(Subject subject);
	public Subject showSubject(Subject subject);
	public List<Subject> getSubjectList();
	
	
}
