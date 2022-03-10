package com.javasetup.trial.javasetupdemo;

public class Book {
	long id;
	String name;
	String auther;
	public Book(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuther() {
		return auther;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}

}
