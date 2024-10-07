package com.callable;

import java.util.concurrent.Callable;

public class TaskCallable implements Callable<String> {
	String name;
	
	public TaskCallable(String name) {
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		if(name.length()<3 || name.length()>10) {
			throw new Exception("Invalid length of exception");
		}
		return name;
	}

}
