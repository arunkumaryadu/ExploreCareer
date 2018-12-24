package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Branch;
import service.BranchInterface;
@Repository
public class BranchDaoImpl implements BranchInterface {

	 @Autowired
	 private SessionFactory sessionFactory;

	 protected Session getSession(){
		  return sessionFactory.getCurrentSession();
		 }
	 public boolean checkConfiguration() {
			// TODO Auto-generated method stub
			return sessionFactory!=null;
		}
	 @SuppressWarnings("unchecked")
	public List<Branch> getBranchList() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		 Query qry = session.createQuery("from  Branch");
		 List list=qry.list();
		return list;
	}

	public int addBranch(Branch branch) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
		 Branch branch1 = (Branch) session.get(Branch.class, branch.getName());
		 if(branch1!=null)
			 return 2;
		 session.save(branch);
		 trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}

	public int updateBranch(Branch branch) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
		 Branch branch1 = (Branch) session.get(Branch.class, branch.getName());
		 if(branch1==null)
			 return 2;
		 branch1.setDetails1(branch.getDetails1());
		 branch1.setDetails2(branch.getDetails2());
		 branch1.setFieldName(branch.getFieldName());
		 session.update(branch1);
		 trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}

	public int deleteBranch(Branch branch) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		try {
		 Branch branch1 = (Branch) session.get(Branch.class, branch.getName());
		 if(branch1==null)
			 return 2;
		 session.delete(branch1);
		 trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		finally
		{
		session.close();
		}
		return 1;
	}
	

	public Branch findBranchByName(String name) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		
		 Branch branch1 = (Branch) session.get(Branch.class, name);
		return branch1;
	}

	
	

}
