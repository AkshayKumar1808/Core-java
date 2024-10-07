package pack1;

public class Thread1 extends Thread
{
	synchronized public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}
	public static void main(String[] args) 
	{
		Thread1 t=new Thread1();
		Thread1 t1=new Thread1();
		t.start();
		t1.start();

	}

}
