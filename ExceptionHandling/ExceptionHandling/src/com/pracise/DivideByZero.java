package com.pracise;

public class DivideByZero {
	int num;
	public DivideByZero(int num) {
		this.num=num;
	}
	public int divide(int number) throws CustomException
	{
		if(number==0) {
			//throw new NullPointerException("you cannot ivide by zero");
			throw new CustomException("you cannot divide by zero");
		}
		return num/number;
	}

}
