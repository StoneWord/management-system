package nuc.ss.service;

import java.util.List;

import nuc.ss.entity.Courier;



public interface courierService {
	int addCourier(Courier courier);

	List<Courier> queryAllCourier();

	int removeCourier(int id);

	Courier queryOneCourier(int id);

	int updateCourier(Courier courier);
	
    List<Courier> GetByPage(int pageNow);
	
	int GetPageCount();
	
    Courier login(String uid, String pwd);
}
