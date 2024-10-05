package com.pracise;

public class CustomException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;
	public CustomException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
