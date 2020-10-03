package nuc.ss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Information;
import nuc.ss.service.informationService;
import nuc.ss.serviceImpl.inforServiceImpl;

public class UpdateInformationServletps extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// 1、解决编码问题
    	req.setCharacterEncoding("utf-8");
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	//2、接受前台数据，并将前台数据封装成一个对象
    	int kd_no = Integer.parseInt(req.getParameter("kd_no"));    	
    	String sj_name = req.getParameter("sj_name");
    	String sj_phone = req.getParameter("sj_phone");
    	String sj_address = req.getParameter("sj_address");
    	String fj_name = req.getParameter("fj_name");
    	String fj_phone = req.getParameter("fj_phone");
    	String fj_address = req.getParameter("fj_address");
    	String ps_name = req.getParameter("ps_name");
    	String ps_phone = req.getParameter("ps_phone");
    	String ps_condition = req.getParameter("ps_condition");
    	String gs_no = req.getParameter("gs_no");
    	String ps_no = req.getParameter("ps_no");
    	System.out.println("test");
    	
    	// String-->Util.Date
    	
    	
    	
    	
    	Information information = new Information(
    		kd_no,sj_name,sj_phone,sj_address,fj_name,fj_phone,fj_address,
    		ps_name,ps_phone,ps_condition,gs_no,ps_no
    	);
    	
		
		// 3、调用service层，然后传入Information
		informationService ns = new inforServiceImpl();
		
		int n = ns.updateInformation(information);
		
		// 4、处理结果
    	if(n >0) {
    		//修改成功
    		resp.sendRedirect("disPlay3.jsp"); 
    	}else {
    		// 修改失败
    		resp.sendRedirect("disPlay3.jsp");
    	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
