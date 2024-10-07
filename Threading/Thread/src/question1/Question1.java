/*
 * create a multi-threaded application by using Thread pool.create 2 threads. 
 * each thread should display characters from A to J.
 *  [ make sure while one thread executes , other thread should not interfere ]
 */
package question1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question1 {

	public static void main(String[] args) 
	{
		ThreadClass t=new ThreadClass();
		ExecutorService exec=Executors.newFixedThreadPool(2);
		exec.execute(t);
		exec.execute(t);
		exec.shutdown();

	}

}
