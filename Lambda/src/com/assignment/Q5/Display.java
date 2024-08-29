package com.assignment.Q5;

public class Display {
	synchronized void disp() {
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		Runnable r=()->{d.disp();};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}

}
