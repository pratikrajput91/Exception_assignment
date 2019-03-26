package com.capgemini_Student;

import org.junit.Test;

public class StudentTest {

		@Test(expected=AgeNotWithinRange.class)
		public void testIsageNotInRange() throws AgeNotWithinRange{
			
			Student s1 =new Student(45,"jgthdh");
			s1.getAge();
			
	}

@Test(expected=NameNotValid.class)
public void testIsNameNotValid() throws NameNotValid{
	
	Student s2 =new Student(145,"jgt@hdh");
	s2.getName();
}
}
