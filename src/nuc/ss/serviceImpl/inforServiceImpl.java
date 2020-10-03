package nuc.ss.serviceImpl;

import java.util.List;

import nuc.ss.Dao.informationDao;
import nuc.ss.daoimpl.informationDaoImpl;
import nuc.ss.entity.Information;
import nuc.ss.service.informationService;

public class inforServiceImpl implements informationService{
	private informationDao nd = new informationDaoImpl();
	@Override
	public int addInformation(Information information) {
		// TODO Auto-generated method stub
		return nd.insertOne(information);
	}

	@Override
	public List<Information> queryAllInformation() {
		// TODO Auto-generated method stub
		return nd.selectAll();
	}

	@Override
	public int removeInformation(int id) {
		// TODO Auto-generated method stub
		return nd.deleteOne(id);
	}

	@Override
	public Information queryOneInformation(int id) {
		// TODO Auto-generated method stub
		return nd.selectOne(id);
	}

	@Override
	public int updateInformation(Information Information) {
		// TODO Auto-generated method stub
		return nd.updateOne(Information);
	}

	@Override
	public List<Information> GetByPage(int pageNow) {
		// TODO Auto-generated method stub
		return nd.getByPage(pageNow);
	}
	/*
	 * public List<Information> GetByPage1(int pageNow,String id) { // TODO
	 * Auto-generated method stub return nd.getByPage1(pageNow,id); }
	 */

	@Override
	public int GetPageCount() {
		// TODO Auto-generated method stub
		return nd.getPageCount();
	}
	
	/*
	 * public int GetPageCount1(String id) { // TODO Auto-generated method stub
	 * return nd.getPageCount1(id); }
	 */
	
	public List<Information> querySome(int id) {
		
		return nd.selectSome(id);
	}

}
