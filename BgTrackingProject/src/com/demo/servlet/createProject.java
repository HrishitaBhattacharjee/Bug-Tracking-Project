package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


//@WebServlet("/createProject")
public class createProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session=request.getSession();
			PrintWriter out=response.getWriter();
			String role=(String) session.getAttribute("role");
			if(role!=null && role.equalsIgnoreCase("role")) {
				Integer managerId=(Integer)session.getAttribute("managerId");
				BugTrackService bService=new BugTrackServiceImpl();
				List<User> ulist=new ArrayList<>();
				request.setAttribute("ulist",ulist);
				RequestDispatcher rd=request.getRequestDispatcher("createProject.html");
				rd.forward(request, response);
				
				
			}
			}
			else {
				out.println("you are not autherized user");
				//RequestDispatcher rd=request.getRequestDispatcher(homepageaddress);
				session.invalidate();
				//rd.include(request, response);
				//out.println("testing");
				
				
			}

}
