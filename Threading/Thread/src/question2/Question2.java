/*
 * create a multi-threaded application by using Thread pool.create 2 threads. 
 * each thread should display numbers from 1 to 10. 
 * [ make sure while one thread executes , other thread should not interfere ]
Also when first thread displays nos. from 1 to 5 it should released the lock and allow other thread to display nos. from 1 to 5 
and then previous thread will display nos. from 6 to 10 and so on.
 */
package question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question2 
{

	public static void main(String[] args) 
	{
		MyLock m=new MyLock();
		ExecutorService exec=Executors.newFixedThreadPool(2);
		exec.execute(m);
		exec.execute(m);
		exec.shutdown();
		

	}

}
