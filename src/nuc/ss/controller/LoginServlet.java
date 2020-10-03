package nuc.ss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.entity.Company;
import nuc.ss.entity.Courier;
import nuc.ss.service.companyService;
import nuc.ss.service.courierService;
import nuc.ss.serviceImpl.companyServiceImpl;
import nuc.ss.serviceImpl.courierServiceImpl;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		//获取前台数据
		String uid = request.getParameter("uid");
		String upassword = request.getParameter("upassword");
		String type = request.getParameter("type");
		System.out.println(type);
		
		if(type.equals("k")) {
			//调用service层，检查当前登录的帐号是否存在，即当前用户是否为合法用户
			courierService us = new courierServiceImpl();
			Courier courier = us.login(uid, upassword);
			
			if(courier != null) {
				
				request.getSession().setAttribute("courier", courier);
				request.getRequestDispatcher("disPlay3.jsp").forward(request, response);
			
			}else {
				
				request.getRequestDispatcher("login_failure.jsp").forward(request, response);
			}
		}else
			if(type.equals("g")) {
				companyService us = new companyServiceImpl();
				Company company = us.login(uid, upassword);
				if(company != null) {					
					response.sendRedirect("disPlay2.jsp");
				}else {
					request.getRequestDispatcher("login_failure.jsp").forward(request, response);
				}
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
