package pack1;
/*
 * above program  using "implements Runnable" method.
 */
public class Question2 implements Runnable
{
	synchronized public void run()
	{
		for(char ch='A';ch<='J';++ch)
		{
			System.out.println(ch);
		}
	}

	public static void main(String[] args) 
	{
		Question2 q=new Question2();
		Thread t1=new Thread(q);
		Thread t2=new Thread(q);
		t1.start();
		t2.start();
		

	}

}
