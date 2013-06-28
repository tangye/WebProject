package controller;

import java.io.IOException;

import javax.servlet.ServletException；
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;//导入需要的包



@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {

		// TODO Auto-generated method stub，类的扩展
		

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse res)

			throws ServletException, IOException {
			request.getSession().removeAttribute("userName");
	}
	//对异常的处理
}
