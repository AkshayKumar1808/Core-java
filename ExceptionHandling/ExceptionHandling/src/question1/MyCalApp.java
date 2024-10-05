package question1;
import java.util.Scanner;
public class MyCalApp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		try {
			c.Caldouble(num);
		} catch (MyArithmaticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
