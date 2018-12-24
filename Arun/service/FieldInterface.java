package service;

import model.Field;
import model.Stream;
import model.Subject;

public interface FieldInterface {

	public boolean checkConfiguration(); 
	public int addField(Field field);
	public int updateField(Field field);
	public int deleteField(Field field);
	public Field showField(Field field);

}
