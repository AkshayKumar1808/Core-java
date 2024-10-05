package question1;

public class Calculator 
{
	public int Caldouble(int num) throws MyArithmaticException
	{
		if(num==0)
		{
			throw new MyArithmaticException("zero not allowed");
		}
		else if(num<0)
		{
			throw new MyArithmaticException("negative values are not allowed");
		}
		else
			return num*2;
	}
}
