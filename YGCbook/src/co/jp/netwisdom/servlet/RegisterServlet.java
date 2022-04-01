package co.jp.netwisdom.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserInfoDAO;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// 从前台接收到客户注册用的所有值
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String major = req.getParameter("major");
		String intro = req.getParameter("intro");
		String[] hobbyArray = req.getParameterValues("hobby");
		
		// 插入数据库（userinfo）
		UserInfoDAO daoForUserInfo = new UserInfoDAO();
		//boolean flagForUserInfo = daoForUserInfo.insertUserInfo(username, password, gender, major, intro);
		
		if(daoForUserInfo.insertUserInfo(username, password, gender, major, intro)) {
			//req.getRequestDispatcher("userInfoRegSucess.jsp").forward(req,resp);
			resp.sendRedirect("userInfoRegSucess.jsp");
		}
		
		// 插入数据库（hobby）TODO
       		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		this.doGet(req, resp);
	}





}
