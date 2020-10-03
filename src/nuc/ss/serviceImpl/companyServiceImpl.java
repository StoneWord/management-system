package nuc.ss.serviceImpl;

import nuc.ss.Dao.companyDao;


import nuc.ss.daoimpl.companyDaoImpl;
import nuc.ss.entity.Company;
import nuc.ss.service.companyService;

public class companyServiceImpl implements companyService{
	private companyDao cd = new companyDaoImpl();
	@Override
	public Company login(String uid, String pwd) {
		// TODO Auto-generated method stub
		return cd.findOne(uid, pwd);
	}
}
