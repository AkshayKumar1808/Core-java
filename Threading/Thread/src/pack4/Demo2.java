package pack4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 
{

	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		ExecutorService exec=Executors.newFixedThreadPool(3);
		exec.execute(m);
		exec.execute(new MyClass());
		exec.execute(m);
		exec.shutdown();
	}

}
