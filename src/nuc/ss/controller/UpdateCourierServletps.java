package nuc.ss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Courier;
import nuc.ss.service.courierService;
import nuc.ss.serviceImpl.courierServiceImpl;

public class UpdateCourierServletps extends HttpServlet {
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
    	int ps_no = Integer.parseInt(req.getParameter("ps_no"));
    	String ps_name = req.getParameter("ps_name");
    	String ps_phone = req.getParameter("ps_phone");
    	String ps_area = req.getParameter("ps_area");
    	int ps_num = Integer.parseInt(req.getParameter("ps_num"));
    	int ps_salary = Integer.parseInt(req.getParameter("ps_salary"));
    	String ps_password = req.getParameter("ps_password");
    	String gs_no = req.getParameter("gs_no");
    	// String-->Util.Date
    	
    	Courier courier = null;
		
    	courier = new Courier(ps_no,ps_name,ps_phone,ps_area,ps_num,ps_salary,ps_password
				,gs_no);
    	
    	
		
		// 3、调用service层，然后传入courier
		courierService ns = new courierServiceImpl();
		
		int n = ns.updateCourier(courier);
		
		System.out.println(n);
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
