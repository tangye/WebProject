package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Activity;
import model.ActivityDao;

public class GetActivityServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
		ArrayList<Activity> activities=ActivityDao.getAllActivities();
		String str="";
		for(int i=0;i<activities.size();i++){
			str +=activities.get(i).title;
			str +="#";
			str +=activities.get(i).pageURL;
			str +="&";
		}
		res.setCharacterEncoding("UTF-8");
		res.setHeader("content-type","text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print(str);
		out.flush();
		out.close();	
	}
}
