package pack2;

public class ThreadLock1 implements Runnable
{
	ThreadLock1 t1;
	synchronized static void disp()//that method is static and synchronized the lock is on the class
	{
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread());
			System.out.println("Akshay"+i);
			
				try 
				{
					Thread.sleep(90000000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
		}
	}
	public void run()
	{
		disp();
	}
	public static void main(String[] args)
	{
	ThreadLock1 t1=new ThreadLock1();
			
		
		Thread t2=new Thread(t1);
		Thread t3=new Thread(t1);
		t2.setName("First");
		t3.setName("Secound");
		t2.start();
		t3.start();

	}

}
