package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Activity;
import model.ActivityDao;
import model.User;
import model.UserDao;

@SuppressWarnings("serial")
public class AddActivityServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
		Activity activity=new Activity();
		PrintWriter out = res.getWriter();
		activity.title = request.getParameter("title");
		activity.pageURL=request.getParameter("url");
		activity.belongs=(String)request.getSession().getAttribute("userName");
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
