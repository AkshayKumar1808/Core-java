package com.assignment.Q4;
/* define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.

*/
@FunctionalInterface
public interface Calculator {
	int multiply(int a,int b);
}
