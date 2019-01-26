package service;

import java.util.List;

import model.Expert;

public interface ExpertInterface {
	public int addExpert(Expert Expert);
	public int removeExpert(String s);
	public int updateExpert(Expert Expert);
	public List showAllExpert();
	public Expert showSingleExpert(String s); 

}