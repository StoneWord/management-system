package nuc.ss.Dao;


import java.util.List;

import nuc.ss.entity.Courier;




public interface courierDao {
	int insertOne(Courier courier);

	List<Courier> selectAll();

	int deleteOne(int id);

	Courier selectOne(int id);

	int updateOne(Courier courier);
	
    List<Courier> getByPage(int pageNow);
	
	int getPageCount();
	
	Courier findOne(String uid, String pwd);
}
