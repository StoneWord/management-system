package nuc.ss.Dao;


import nuc.ss.entity.Company;



public interface companyDao {
	int insertOne(Company company);

	Company findOne(String uid, String pwd);
	
	boolean findOne(String uid);
}
