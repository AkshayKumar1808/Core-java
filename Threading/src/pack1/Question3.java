package pack1;
/*
 * create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
 * they should display output "Exec  0" to "Exec 5".
 */
public class Question3 implements Runnable
{
	synchronized public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Exe"+i);
		}
	}

	public static void main(String[] args) 
	{
		Question3 q=new Question3();
		Thread t1=new Thread(q);
		Thread t2=new Thread(q);
		Thread t3=new Thread(q);
		t1.start();
		t2.start();
		t3.start();

	}

}
