package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.SubjectDaoImpl;
import model.Subject;
 

@Service
public class SubjectServiceImpl {
		@Autowired
		static  SubjectDaoImpl subjectDao;
		 public List getSubjectList() {
		  return subjectDao.getSubjectList();
		 }

		 public void saveOrUpdate(Subject subject) {
			 subjectDao.saveOrUpdate(subject);
		 }

		 public void deleteSubject(String name) {
			 subjectDao.deleteSubject(name);
		 }

		 public Subject findSubjectByName(String name) {
		  return subjectDao.findSubjectByName(name);
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 subjectDao=contex.getBean(SubjectDaoImpl.class);
		 subjectDao.f1(); 
		 Subject subject=new Subject();
		 subject.setName("Physics");
		 subject.setDetails("We can define Physics as the science that deals with matter, energy and their interactions. Physics functions in an exciting dimension.Physics can be divided into various branches, and in modern days each branches has acquires a status of a full subject. The traditional branches or the main branches of classical physics are Mechanics, Optics, Thermodynamics, Electromagnetism, Acoustics.");	
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Chemistry");
		 subject.setDetails("Chemistry is one of the basic branches of science that deals with the properties, structure, and constituents of matter or substances and its interactions with other forms of matter. There is a lot of difference that can be seen when you compare Basic Chemistry and Modern chemistry.The domain of chemistry comprises of the study of the composition of matter, its structure, and properties. The fundamental constituents of matter, atoms & molecules, form the basis of chemistry. ");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Mathematics");;
		 subject.setDetails("Mathematics can, broadly speaking, be subdivided into the study of quantity, structure, space, and change (i.e. arithmetic, algebra, geometry, and analysis). In addition to these main concerns, there are also subdivisions dedicated to exploring links from the heart of mathematics to other fields: to logic, to set theory (foundations).");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Biology");
		 subject.setDetails("Biology is the science of life that involves the study of living organisms, including their chemical compositions, physical compositions, developments, functions, and evolution.Some branches of biology are Botany,Zoology,Biochemistry,Ecology,Genetics,Evolutionary Biology,Cellular Biology");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Accounts");
		 subject.setDetails("The Accountancy syllabus  gives students a firm foundation in basic accounting principles and methodology and also acquaints them with the changes taking place in the presentation and analysis of accounting information, keeping in view the development of accounting standards and use of computers.");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Business Studies");
		 subject.setDetails("Business is a dynamic process that brings together technology, natural resources and human initiative in a constantly changing global environment. Business Studies  develops a good understanding of the principles and practices bearing in business (trade and industry) as well as their relationship with the society.\");");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Economics");
		 subject.setDetails("Indian Economic Development and Statistics these two are major divisions which you are going to study here. Knowing about the country’s economy rate and it’s developments over the years. You will also come across formulas, charts, theory, graphs in economics.");
		 subjectDao.saveOrUpdate(subject);
		 
	}

}
