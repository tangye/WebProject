package controller;

import java.io.IOException;//引入IO包
import java.io.PrintWriter;//引入IO包
import java.text.DateFormat;//引入text包
import java.util.Date;//引入util包

import javax.servlet.ServletException;//引入servlet包
import javax.servlet.http.HttpServlet;//引入servlet包
import javax.servlet.http.HttpServletRequest;//引入servlet包
import javax.servlet.http.HttpServletResponse;//引入servlet包

import model.Activity;//引入model包
import model.ActivityDao;//引入model包
import model.User;//引入model包
import model.UserDao;//引入model包

@SuppressWarnings("serial")
public class AddActivityServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub
		

	}//创建一个AddActivityServlet类,从HttpServlet继承而来
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
		Activity activity=new Activity();//生成一个Activity类的activity
		PrintWriter out = res.getWriter();
		activity.title = request.getParameter("title");//把tile作为参数输入
		activity.pageURL=request.getParameter("url");//把url作为参数输入
		activity.belongs=(String)request.getSession().getAttribute("userName");//把userName作为参数输入
		Date now = new Date();
		DateFormat d3 = DateFormat.getTimeInstance(); 
	        String str3 = d3.format(now); 
		activity.ID=str3;
		ActivityDao.addActivity(activity);	
		out.print(activity.pageURL);
		out.flush();
		out.close();
	}
}
