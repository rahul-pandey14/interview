package com.interview.basics;

public class Test {

	// How to declare a static variable?
	private static String name;

	// How to declare an instance variable?
	private String email;

	// How to create a static block?

	static {
		// Always execute at the time of class loading.
	}

	// How to create an instance block?

	{
		// Always execute just before the object creation.

	}

	// How to write an Instance method?

	private void instanceMethod() {

		// Memory will be allocated to each instance method separately for every
		// object creation.
	}

	// How to create a static method?

	private static void staticMethod() {

		// Memory will be allocate at the time of class loading.
	}

}
