package service;

import java.util.List;

import model.Branch;
public interface BranchInterface {
	public boolean checkConfiguration(); 
	public  List<Branch> getBranchList() ;
	public int addBranch(Branch branch);
	public int updateBranch(Branch branch);
	public int deleteBranch(Branch branch);
    public Branch findBranchByName(String name);
   
    
		  
		 
}
