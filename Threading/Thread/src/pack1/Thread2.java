package pack1;

public class Thread2 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread());
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello"+i);
		}
	}

	public static void main(String[] args) 
	{
		Thread2 t=new Thread2();
		System.out.println(Thread.currentThread());
		t.setName("First");
		t.start();

	}

}
