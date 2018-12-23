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
		 subject.setDetails("Physics Class 12 Syllabus-Electric Charges and Fields,Electrostatic Potential and Capacitance,Current Electricity,Moving Charges and Magnetism ,Magnetism and Matter,Electromagnetic Induction,Alternating Current,Electromagnetic Waves,Ray Optics and Optical Instruments ,Wave Optics ,Dual Nature of Radiation and Matter,Atoms,Nuclei,Semiconductor Electronics: Materials, Devices and Simple circuits,Communication System");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Chemistry");
		 subject.setDetails("Chemistry Class 12 Syllabus-Solid State,General Principle and Process of Isolation of Elements,Haloalkanes and Haloarenes,Solutions,The p-Block Elements,Alcohols, Phenols and Ethers,Electrochemistry,Aldehydes, Ketones and Carboxylic Acids,Chemical Kinetics,The d- and f- Block Elements,Amines,Surface Chemistry,Biomolecules,Coordination Compounds,Polymers,Chemistry in Everyday Life");
		 subjectDao.saveOrUpdate(subject);
		 subject.setName("Mathematics");;
		 subject.setDetails("Mathematics Class 12 Syllabus- Relations and Functions,Algebra,Calculus, Vectors and Three-Dimensional Geometry,Linear Programming,Probability");
		 subjectDao.saveOrUpdate(subject);
	}

}
