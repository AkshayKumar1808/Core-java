package pack1;

public class Thread3 extends Thread
{
	synchronized public void run()
	{
		//System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
		
		System.out.println("Akshay"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(10);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread());
		Thread3 t=new Thread3();
		Thread3 t1=new Thread3();
		t.setName("First");
		t1.setName("Second");
		t.start();
		t1.start();
		

	}

}
