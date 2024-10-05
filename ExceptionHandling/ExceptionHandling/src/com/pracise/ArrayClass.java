package com.pracise;

public class ArrayClass {
	int size;
	int []arr;
	
	public ArrayClass(int size) {
		this.size=size;
		arr=new int[size];
	}
	
	public void add(int index,int value) throws CustomException
	{
		if(index>=size) {
		arr[index]=value;
		//throw new ArrayIndexOutOfBoundsException(size +" this is the invalid index postion");
		throw new CustomException(size +" this is the invalid index postion");
		}
		else {
			arr[index]=value;
			System.out.println("the value addes successfully");
		}
	}
	
	
	
	

}
