package Exception;

public class Prog4 {

	public static void main(String[] args) {
		//Multiple catch block exception
		
		try {
			
			
			
			int a=10,b=0,c=0;
			c=a/b;
			System.out.println("Result"+c);
			
		}
		
		
		catch(NullPointerException h)
		{
			System.out.println(h);
		
		}
		
		catch (ArithmeticException a)
		{
			System.out.println(a);
			
		}
		catch(Exception z)
		{
			System.out.println(z);
		}
	}

}
