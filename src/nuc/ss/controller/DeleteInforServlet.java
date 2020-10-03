package nuc.ss.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nuc.ss.service.informationService;
import nuc.ss.serviceImpl.inforServiceImpl;

public class DeleteInforServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// 1、解决编码问题
    	req.setCharacterEncoding("utf-8");
    	resp.setCharacterEncoding("utf-8");
    	resp.setContentType("text/html;charset=utf-8");
    	// 2、获取前台传过来的id
    	int id = Integer.parseInt(req.getParameter("id"));
    	// 3、调用Service层
    	informationService ns = new inforServiceImpl();
    	int n = ns.removeInformation(id);
    	// 4、处理结果
    	if(n>0) {
    		//删除成功，则直接刷新页面
    		resp.sendRedirect("disPlay2.jsp");
    	}else {
    		resp.getWriter().println("删除失败！");
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
