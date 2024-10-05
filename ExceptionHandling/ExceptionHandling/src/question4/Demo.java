package question4;

public class Demo {

	public static void main(String[] args) 
	{
		try {
			Authenticator A=new Authenticator("Ak");
			A.done();
		} catch (InvalidLengthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
