package com.demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/mainPagePM")
public class ProjectManagerMainPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProjectManagerMainPage() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}


	public static void main(String[] args) {
		<servlet>
		       <servlet-name>display</servlet-name>
		       <servlet-class>com.demo.servlet.DisplayUserServlet</servlet-class>
		       <load-on-startup>1</load-on-startup>
		  </servlet>
		  <servlet-mapping>
		        <servlet-name>display</servlet-name>
		        <url-pattern>/display</url-pattern>
		  </servlet-mapping>
	}

}
