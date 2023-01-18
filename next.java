package com.packege;

import jakarta.servlet.*;
import java.io.*;


public class exam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome exam servlet</h1>");
		
		String name=request.getParameter("name");
		out.println("Welcome  "+name);
		
	
		String name=request.getParameter("name");
		String email =request.getParameter("email");
		String gender=request.getParameter("gender");
		String course=request.getParameter("course");
		String tc=request.getParameter("tc");
		
		if(tc!=null) {
			if(tc.equals("checked")) {
				out.println("<h2> Name : " +name+ "</h2>");
				out.println("<h2> Email : " +email+ "</h2>");
				out.println("<h2> Gender : " +gender+ "</h2>");
				out.println("<h2> course : " +course+ "</h2>");
				
//			Cookie create (data save in cookie)	
				
				
			}else {
				out.println("<h2>You have Not Acceptyed T&C</h2>");
			}
		}else {
			out.println("<h2>You have Not Acceptyed T&C</h2>");
		}
		
	}
	
	
}
