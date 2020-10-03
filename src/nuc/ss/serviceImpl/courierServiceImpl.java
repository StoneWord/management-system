package nuc.ss.serviceImpl;

import java.util.List;

import nuc.ss.Dao.*;
import nuc.ss.daoimpl.*;
import nuc.ss.entity.Courier;

import nuc.ss.service.courierService;

public class courierServiceImpl implements courierService {
	private courierDao cd = new courierDaoImpl();
	@Override
	public int addCourier(Courier courier) {
		// TODO Auto-generated method stub
		return cd.insertOne(courier);
	}

	@Override
	public List<Courier> queryAllCourier() {
		// TODO Auto-generated method stub
		return cd.selectAll();
	}

	@Override
	public int removeCourier(int id) {
		// TODO Auto-generated method stub
		return cd.deleteOne(id);
	}

	@Override
	public Courier queryOneCourier(int id) {
		// TODO Auto-generated method stub
		return cd.selectOne(id);
	}

	@Override
	public int updateCourier(Courier courier) {
		// TODO Auto-generated method stub
		return cd.updateOne(courier);
	}

	@Override
	public List<Courier> GetByPage(int pageNow) {
		// TODO Auto-generated method stub
		return cd.getByPage(pageNow);
	}

	@Override
	public int GetPageCount() {
		// TODO Auto-generated method stub
		return cd.getPageCount();
	}

	@Override
	public Courier login(String uid, String pwd) {
			
			return cd.findOne(uid, pwd);
		
	}

}
