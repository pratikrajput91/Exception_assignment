package com.capgemini_exception;

public class Factorial {
	private int num;
	private long result = 1;

	public Factorial(int num) {
		super();
		this.num = num;
	}

	public long getfactorial() throws InvalidInputException, ExeedValueException {
		if (num <= 2) {
			throw new InvalidInputException("Invalid Input");
		}

		for (int i = 1; i <= num; i++) {
			result = (result * i);
		}
		if (result > Integer.MAX_VALUE) {
			throw new ExeedValueException("value more than max value");

		}
		return result;
	}
	/*
	 * public long FindFactorial() throws ExeedValueException{ if
	 * (getfactorial()>=Integer.MAX_VALUE) { throw new
	 * ExeedValueException("Value exceed the maximum integer value"); } }
	 */

}