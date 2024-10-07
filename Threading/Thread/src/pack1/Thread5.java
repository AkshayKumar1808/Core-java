package pack1;

public class Thread5 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Akshay"+i);
		}
	}
	public static void main(String[] args) 
	{
		Thread5 t=new Thread5();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		

	}

}
