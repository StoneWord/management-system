package nuc.ss.controller;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Courier;
import nuc.ss.service.courierService;
import nuc.ss.serviceImpl.courierServiceImpl;

public class AddCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// 1、解决编码问题
    	req.setCharacterEncoding("utf-8");
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	

    	String ps_no = req.getParameter("ps_no");
    	String ps_name = req.getParameter("ps_name");
    	String ps_phone = req.getParameter("ps_phone");
    	String ps_area = req.getParameter("ps_area");
    	String ps_num = req.getParameter("ps_num");
    	String ps_salary = req.getParameter("ps_salary");
    	String ps_password = req.getParameter("ps_password");
    	String gs_no = req.getParameter("gs_no");
    	
    	
    	
    	
    	int psno;
    	int psnum;
    	int pssalary;
    	Courier courier = null;
		psno = Integer.parseInt(ps_no);	
		psnum = Integer.parseInt(ps_num);	
		pssalary = Integer.parseInt(ps_salary);	

		courier = new Courier(psno,ps_name,ps_phone,ps_area,psnum,pssalary,ps_password
				,gs_no);
		
		// 3、调用service层，然后传入news
		courierService ns = new courierServiceImpl();
		
		int n = ns.addCourier(courier);
		
		// 4、处理结果
    	if(n >0) {
    		//插入成功
    		resp.sendRedirect("disPlay.jsp"); 
    	}else {
    		// 插入失败
    		req.getRequestDispatcher("addCourier.jsp").forward(req, resp);
    		
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
