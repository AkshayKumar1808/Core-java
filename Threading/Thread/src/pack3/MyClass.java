package pack3;

public class MyClass implements Runnable
{
	public void run()
	{
		perform();
	}
	public synchronized void perform()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Hello"+i+" "+Thread.currentThread());
			try {
				
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
