package pack1;
/*
 * create a multi-threaded application by using  "extends Thread " method.create 2 threads. 
 * they should display characters from A to J.
 */
public class DispalyChar extends Thread
{
	synchronized public void run()
	{
		char i='A';
		for(i='A';i<='j';i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		DispalyChar c1=new DispalyChar();
		DispalyChar c2=new DispalyChar();
		c1.start();
		c2.start();

	}

}
