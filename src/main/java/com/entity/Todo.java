package com.entity;

import java.util.Date;

public class Todo {

	private String todo_title;
	private String todo_content;
	private Date todo_Date;
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String todo_title, String todo_content, Date todo_Date) {
		super();
		this.todo_title = todo_title;
		this.todo_content = todo_content;
		this.todo_Date = todo_Date;
	}
	public String getTodo_title() {
		return todo_title;
	}
	public void setTodo_title(String todo_title) {
		this.todo_title = todo_title;
	}
	public String getTodo_content() {
		return todo_content;
	}
	public void setTodo_content(String todo_content) {
		this.todo_content = todo_content;
	}
	public Date getTodo_Date() {
		return todo_Date;
	}
	public void setTodo_Date(Date todo_Date) {
		this.todo_Date = todo_Date;
	}
	@Override
	public String toString() {
		return this.getTodo_title() + " : " + this.getTodo_content();
	}
	
}
