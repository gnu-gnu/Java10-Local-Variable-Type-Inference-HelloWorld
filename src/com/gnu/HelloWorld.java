package com.gnu;

/**
 * 
 * Java 10 new feature, local-type inference test Hello World
 * 
 * @author Geunwoo Shim(geunwoo.j.shim@gmail.com)
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		var helloWorld = "Hello, World!";
		System.out.println(helloWorld);
		// as JEP 286(Local-Variable Type Inference, http://openjdk.java.net/jeps/286), there are some errors below
		// example
		/*
		 * var x; // cannot use 'val' on variable without initializer
		 * var f = () -> { }; // lambda expression needs an explicit target-type
		 * var g = null; // variable initializer is 'null'
		 * var a = 1, b = 2; // not allowed in a compound declaration
		 * var arr = {1,2,3} // Array initializer needs an explicit target-type
		 * var helloWorld = "Hello, World!";
		   helloWorld = 1; // cannot change a type after initialize, cannot convert from int to String
		 */
		
	}
}
