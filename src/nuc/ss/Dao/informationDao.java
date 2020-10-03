package nuc.ss.Dao;

import java.util.List;

import nuc.ss.entity.Information;

public interface informationDao {
	int insertOne(Information information);

	List<Information> selectAll();

	int deleteOne(int id);

	Information selectOne(int id);

	int updateOne(Information information);
	
     List<Information> getByPage(int pageNow);
     
	/* List<Information> getByPage1(int pageNow,String id); */
	
	int getPageCount();
	
	/* int getPageCount1(String id); */
	
	Information findOne(String uid, String pwd);
	
	List<Information> selectSome(int id);
}
