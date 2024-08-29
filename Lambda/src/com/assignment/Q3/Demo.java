package com.assignment.Q3;

public class Demo {
	static void perform(MyInterface ref) {
		ref.fun();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(()->{System.out.println("lambda pass as argument");});
	}

}
