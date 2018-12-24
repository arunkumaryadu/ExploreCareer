package service;

import model.Stream;
import model.Subject;

public interface StreamInterface {
	public boolean checkConfiguration(); 
	public int addStream(Stream stream);
	public int updateStream(Stream stream);
	public int deleteStream(Stream stream);
	public Subject showStream(Stream stream);
}
