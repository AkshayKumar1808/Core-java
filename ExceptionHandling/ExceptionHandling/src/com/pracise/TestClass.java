package com.pracise;
import java.util.*;
public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		ArrayClass arr=new ArrayClass(size);
		
		System.out.println("Enter the index");
		int index=sc.nextInt();
		System.out.println("Enter the value");
		int value=sc.nextInt();
		//the add method raise the exception and declare it also we have handle this in the main
		try
		{
			arr.add(index, value);
		}catch(CustomException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the number");
		int number=sc.nextInt();
		DivideByZero d=new DivideByZero(number);
		System.out.println("Enter the number to divide");
		int no=sc.nextInt();
		
		//the divide() raise the exception we have handle it here
		try {
			d.divide(no);
		}catch(CustomException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}

}
