package nuc.ss.service;

import java.util.List;

import nuc.ss.entity.Information;


public interface informationService {
	int addInformation(Information information);

	List<Information> queryAllInformation();

	int removeInformation(int id);

	Information queryOneInformation(int id);

	int updateInformation(Information Information);
	
    List<Information> GetByPage(int pageNow);
	
	/* List<Information> GetByPage1(int pageNow,String id); */
    
	int GetPageCount();
	
	/* int GetPageCount1(String id); */
	
	List<Information> querySome(int id);
}
