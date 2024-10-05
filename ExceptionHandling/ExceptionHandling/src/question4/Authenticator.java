package question4;

public class Authenticator 
{
	private String pass;
	public Authenticator(String pass) throws InvalidLengthException
	{
		this.pass=pass;
		if(pass.length()<5||pass.length()>9)
		{
			throw new InvalidLengthException("You entered the atleast 5 char or atmost 9");
		}
	}
	public void done()
	{
		System.out.println("Authentication done");
	}
}
