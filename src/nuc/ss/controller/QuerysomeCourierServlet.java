package nuc.ss.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nuc.ss.entity.Courier;
import nuc.ss.service.courierService;
import nuc.ss.serviceImpl.courierServiceImpl;

public class QuerysomeCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// 1、解决编码问题
    	req.setCharacterEncoding("utf-8");
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	
    	//2、接受前台数据
    	HttpSession session = req.getSession();
    	Courier courier = (Courier)session.getAttribute("courier");
    	int id = courier.getPs_no();
    	
    	// 3、调用service层，查询指定id的新闻信息
    	courierService ns = new courierServiceImpl();
		
		Courier courier1 = ns.queryOneCourier(id);
		
		// 4、处理结果
		if(courier1 != null) {
			req.setAttribute("courier", courier1);
				req.getRequestDispatcher("disPlay4.jsp").forward(req, resp);	
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
