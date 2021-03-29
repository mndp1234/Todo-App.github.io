package com.cntrl;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entity.Todo;



@Controller
public class HomeCntrl {
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model m) {
		String str ="home";
		List<Todo> list = (List<Todo>) context.getAttribute("list");
		m.addAttribute("page",str);
		m.addAttribute("todos", list);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model m) {
		Todo t = new Todo();
		m.addAttribute("page","add");
		m.addAttribute("todo",t);
		return "home";
	}
	
	@RequestMapping(value="/saveTodo",method = RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t  ,Model m) {
		t.setTodo_Date(new Date());
		//getting the todo list form context
		List<Todo> list = (List<Todo>) context.getAttribute("list");
		list.add(t);
		m.addAttribute("msg","succesfully added");
		return "home";
	}

}
