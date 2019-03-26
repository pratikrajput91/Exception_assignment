package com.capgemini_exception;

import org.junit.Test;



public class FactorialTest {
	

	@Test(expected=InvalidInputException.class)
	public void testIsInvalidInput() throws InvalidInputException, ExeedValueException{
		
		Factorial factorial=new Factorial(1);
		factorial.getfactorial();
		
	}
	@Test(expected=ExeedValueException.class)
	public void testIsExeed() throws ExeedValueException, InvalidInputException{
		
		Factorial factorial1=new Factorial(64561);
		factorial1.getfactorial();	
		
	

}
}