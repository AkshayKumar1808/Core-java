package pack3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1
{

	public static void main(String[] args) 
	{
		MyClass m=new MyClass();
		ExecutorService exec=Executors.newCachedThreadPool();
		
			exec.execute(m);
			exec.execute(m);
			exec.shutdown();

	}

}
