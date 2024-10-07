package com.callable;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		//creating the object of callable class
		TaskCallable tc=new TaskCallable(sc.next());
		//create the threadpool life cycle of thread can be managed by executors
		ExecutorService exe=Executors.newFixedThreadPool(2);
	
		//we call the callable service and which return object in the future
		Future<String> f=exe.submit(tc);
		Future<String> f1=exe.submit(tc);
		Future<String> f2=exe.submit(tc);
		try(sc) 
		{
			System.out.println("the name is "+f.get());
			System.out.println("the name is "+f2.get());
			System.out.println("the name is "+f1.get());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
