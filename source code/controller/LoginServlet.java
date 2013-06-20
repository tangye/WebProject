package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		User user=new User();
		user.ID = request.getParameter("userName");
		user.password = request.getParameter("password");
		if(UserDao.verifyUser(user) == UserDao.VERIFY_CORRECT)
		{
			User tempUser=UserDao.getWholeInfo(user.ID);
			request.getSession().setAttribute("userName",tempUser.ID);
			request.getSession().setAttribute("identity",tempUser.identity);
			request.getSession().setAttribute("email",tempUser.email);
			request.getSession().setAttribute("sex",tempUser.sex);
		}
		if(UserDao.verifyUser(user) == UserDao.NOT_EXIST)
		{
			out.print("NOT_EXIST");	
		}
		if(UserDao.verifyUser(user) == UserDao.WRONG_PASSWORD)
		{
			out.print("WRONG_PASSWORD");	
		}
		out.flush();
		out.close();
	}
}
