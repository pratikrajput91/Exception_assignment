package com.capgemini_Student;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	private int roll_no;
	private String name;
	private int age;
	private String Cource;
	
	public Student(int age, String name){
		super();
		this.age=age;
		this.name=name;
		
	}
public void getAge() throws AgeNotWithinRange{
	if(age<15 || age>21)
		throw new AgeNotWithinRange("age not within range");
	
}
public void getName() throws NameNotValid{
	Pattern pattern=Pattern.compile("[a-zA-Z]");
	Matcher matcher=pattern.matcher(name);
	if(!matcher.matches())
	{
		throw new NameNotValid("name not valid");
	}

}
}
