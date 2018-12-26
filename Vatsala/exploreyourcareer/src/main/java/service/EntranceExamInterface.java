package service;

import java.util.List;

import model.EntranceExam;

public interface EntranceExamInterface {
	public boolean checkConfiguration(); 
	public  List<EntranceExam> getExamList();
	public  List<EntranceExam> getExamListByFieldName(String fieldName) ;
	public int addExam(EntranceExam exam);
	public int updateExam(EntranceExam exam);
	public int deleteExam(EntranceExam exam);
    public EntranceExam findExamByName(String name);
   
}
