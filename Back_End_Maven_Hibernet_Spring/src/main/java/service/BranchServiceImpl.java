package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import config.HibernateConfig;
import dao.BranchDaoImpl;
import dao.SubjectDaoImpl;
import model.Branch;
@Service
public class BranchServiceImpl implements BranchInterface {

@Autowired
BranchDaoImpl branchDaoImpl;

public boolean checkConfiguration() {
	// TODO Auto-generated method stub
	return branchDaoImpl.checkConfiguration();
}

public  List<Branch> getBranchList() {
	// TODO Auto-generated method stub
	return branchDaoImpl.getBranchList();
}

public int addBranch(Branch branch) {
	// TODO Auto-generated method stub
	return branchDaoImpl.addBranch(branch);
}

public int updateBranch(Branch branch) {
	// TODO Auto-generated method stub
	return branchDaoImpl.updateBranch(branch);
}

public int deleteBranch(Branch branch) {
	// TODO Auto-generated method stub
	return branchDaoImpl.deleteBranch(branch);
}

public Branch findBranchByName(String name) {
	// TODO Auto-generated method stub
	return branchDaoImpl.findBranchByName(name);
}
/*

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(HibernateConfig.class);
		 branchDaoImpl=contex.getBean(BranchDaoImpl.class);
		System.out.println(branchDaoImpl.checkConfiguration());
		Branch branch = new Branch();
		branch.setName("CSE");
		branch.setDetails1("Computer Science");
		branch.setDetails2("is a good branch");
		branch.setFieldName("Engineering");
		branchDaoImpl.addBranch(branch);
		branch.setName("IT");
		branch.setDetails1("Information Technology");
		branch.setDetails2("is better than cse");
		branch.setFieldName("Engineering");
		branchDaoImpl.addBranch(branch);
		List<Branch> l=branchDaoImpl.getBranchList();
		for (Branch object : l) {
			System.out.println(object);
		}
		Branch b=branchDaoImpl.findBranchByName("IT");
		System.out.println(b);
		
		Branch branch1 = new Branch();
		branch1.setName("IT");
		branchDaoImpl.deleteBranch(branch1);
		Branch branch2 = new Branch();
		branch2.setName("CSE");
		branch2.setDetails1("Computer Science 1");
		branch2.setDetails2("is a good branch 1");
		branch2.setFieldName("Engineering 1");
		branchDaoImpl.updateBranch(branch2);
		 l=branchDaoImpl.getBranchList();
		for (Branch object : l) {
			System.out.println(object);
		}
		
	}*/
}