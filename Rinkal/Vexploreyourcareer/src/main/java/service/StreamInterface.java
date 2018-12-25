package service;

import java.util.List;

import model.Stream;
import model.Subject;

public interface StreamInterface {
	public boolean checkConfiguration(); 
	public int addStream(Stream stream);
	public int updateStream(Stream stream);
	public int deleteStream(Stream stream);
	public Stream showStream(Stream stream);
	public List<Stream> getStreamList();
}