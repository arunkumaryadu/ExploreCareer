package service;

import java.util.List;

import model.Question;

public interface QuestionInterface {
	public int  askQuestion(Question Q);
	public  List displayMyQuestions(String a);
	public List unAnsweredQuestion();
	public List answeredQuestion(String a);

}