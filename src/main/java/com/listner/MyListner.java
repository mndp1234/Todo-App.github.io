package com.listner;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entity.Todo;

public class MyListner implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		
		
	}

	public void contextInitialized(ServletContextEvent sc) {
		List<Todo> list = new ArrayList<Todo>();
		ServletContext context = sc.getServletContext();
		context.setAttribute("list", list);
		
		
		
	}
	

}
