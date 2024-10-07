package question2;

public class MyLock implements Runnable 
{
	
	public void run()
	{
		perform();
	}
	synchronized  void perform()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==6)
				{
					wait();
					
				}
				System.out.println(i+" "+Thread.currentThread());
				notifyAll();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
