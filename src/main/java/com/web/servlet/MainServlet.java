package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		String message ="Hello World";
		request.setAttribute("message", message);
	    try {
			request.getRequestDispatcher("/HelloWorld.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//response.setContentType("HelloWorld.html");
	}
}
