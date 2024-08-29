/**
 * 
 */
package com.assignment.Q1;

/**
 * @author Admin
 *
 */
@FunctionalInterface
public interface First {
	void disp1();
	
	default void disp2()
	{
		System.out.println("prectise make man perfect");
	}
	static void disp3() {
		System.out.println("Utility method");
	}
}
