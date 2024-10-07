package pack4;

public class MyClass implements Runnable 
{

	@Override
	public void run() 
	{
		perform();
	}
	public synchronized void perform()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Akshay"+i+" "+Thread.currentThread());
		}
		
	}

}
