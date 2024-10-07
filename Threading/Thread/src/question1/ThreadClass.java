package question1;

public class ThreadClass implements Runnable 
{

	@Override
	public void run() 
	{
		
		perform();
	}
	public synchronized void perform()
	{
		for(char i='A';i<='J';i++)
		{
			System.out.println(i);
		}
	}

}
