package scyberboy.lect02;

import java.io.Serializable;

public class Student implements Serializable{
	
	private static final long serialVersionUID = 2166913336029093772L;
	
	private int age;
	private String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
