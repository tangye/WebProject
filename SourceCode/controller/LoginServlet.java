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
		

	}//创建一个LoginServlet类,从HttpServlet继承,并抛出异常
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();//out调用res.getWriter方法
		User user=new User();//创建一个User
		user.ID = request.getParameter("userName");//输入用户名
		user.password = request.getParameter("password");//输入密码
		if(UserDao.verifyUser(user) == UserDao.VERIFY_CORRECT)
		{
			User tempUser=UserDao.getWholeInfo(user.ID);
			request.getSession().setAttribute("userName",tempUser.ID);
			request.getSession().setAttribute("identity",tempUser.identity);
			request.getSession().setAttribute("email",tempUser.email);
			request.getSession().setAttribute("sex",tempUser.sex);
		}//获取用户ID.身份.邮箱.性别
		if(UserDao.verifyUser(user) == UserDao.NOT_EXIST)
		{
			out.print("NOT_EXIST");	
		}//判断不存在
		if(UserDao.verifyUser(user) == UserDao.WRONG_PASSWORD)
		{
			out.print("WRONG_PASSWORD");	
		}//密码错误
		out.flush();
		out.close();
	}
}
