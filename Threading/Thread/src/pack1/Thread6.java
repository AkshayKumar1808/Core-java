package pack1;

public class Thread6 implements Runnable
{
	public void run()
	{
		synchronized (this) 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hello"+i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Thread6 t=new Thread6();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		

	}

}
