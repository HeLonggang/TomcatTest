package com.gzcss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gzcss.dao.impl.UserDaoImpl;
import com.gzcss.entity.User;

public class AddServlet extends HttpServlet {

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		String u_name=request.getParameter("u_name");
		String u_sex=request.getParameter("u_sex");
		String u_phone=request.getParameter("u_phone");
		String u_mail=request.getParameter("u_mail");
		String u_address=request.getParameter("u_address");
		String u_pid=request.getParameter("u_pid");
		String u_mark=request.getParameter("u_mark");
		int u_age=Integer.valueOf(request.getParameter("u_age"));
		if(u_name!=""){
		UserDaoImpl user= new UserDaoImpl();	
		//user.addUser(u_name,u_address,u_mail);
		user.saveUser(u_name,u_sex,u_pid,u_age,u_phone,u_mail,u_address,u_mark);
		request.getRequestDispatcher("demo/show.jsp").forward(request,
				response);
		}else{
			request.getRequestDispatcher("demo/error.jsp").forward(request,
					response);
		}
		}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
