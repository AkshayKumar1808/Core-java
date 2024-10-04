package pack1;
 abstract class Course
{
	public void start()
	{
		System.out.println("We start the our couses in the summer as well as winter");
	}
	public abstract void getfee();
	public abstract void duration();
}
 class summer extends Course
 {
	 public void start()
	 {
		System.out.println("start in summer"); 
	 }
	 public void getfee()
	 {
		 System.out.println("20000 rs is the fees for the summner");
	 }
	public void duration()
	 {
		System.out.println("2 months is the duration");
	 }
	public void discount()
	{
		System.out.println("in summer there is 10% discount on the total amount");
	}
	
 }
 class winter extends Course
 {
	 public void start()
	 {
		 System.out.println("Start in the winter");
	 }
	 public void getfee()
	 {
		System.out.println("15000 rs the fees for the winter");
	 }
	 public void duration()
	 {
		 System.out.println("1.5 months is duration");
	 }
 }
public class Question1 
{
	static void selection(Course[]arr)
	{
		for(Course course:arr)
		{
			course.start();
			course.duration();
			course.getfee();
			if(course instanceof summer)
			{
				summer s=(summer)course;
				s.discount();
			}
			
		}
		
	}
	public static void main(String[] args) 
	{
		Course c[]=new Course[2];
		c[0]=new summer();
		c[1]=new winter();
		
		Question1.selection(c);
	}

}
