package question3;

import java.util.concurrent.locks.ReentrantLock;

public class Locking implements Runnable
{
	ReentrantLock l=new ReentrantLock();
	public void run()
	{
		l.lock();
		perform();
		l.unlock();
	}
	public void perform()
	{
		
		for(char i='A';i<='j';i++)
		{
			System.out.println(i);
		}
		
	}
	
}
