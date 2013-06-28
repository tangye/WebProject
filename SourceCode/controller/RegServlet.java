package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;//导入需要的包

import model.User;
import model.UserDao;

@SuppressWarnings("serial")
public class RegServlet  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {


	}//对异常的处理
}
