package Practice;

public class ElseIf {

	public static void main(String[] args) {
		int mark=74;
		if(mark >= 35 && mark <60)
		{
			System.out.println("second class");
		}
		else if (mark >=60 && mark <75)
		{
			System.out.println("First class");
		}
		else if (mark >=75 && mark <90)
		{ 
			System.out.println("distinction");
		}
		else if (mark >=90 && mark <=100)
		{
			System.out.println("merit");
		}
		else if (mark >100)
		{
			System.out.println("invalid input");
		}
		else 
		{
			System.out.println("fail");
		
		}
	}

}
