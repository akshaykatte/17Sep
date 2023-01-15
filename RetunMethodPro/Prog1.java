package RetunMethodPro;

public class Prog1 {
	public static int sum(int a , int b)
{
	return a+b;
}
	
	public  String m1()
	{
		return "hi good morning i am akshay katte";
	}
	public static String Ak(String k)
	{
		return k;
		
	}
	public static double xyz(double n)
	{
		return n;
	}
public static int mul()
{
	return 78;
}

	public static void main(String[] args) {
		
		double ll =xyz(4569.23);
		System.out.println("the value of return datatype is"+ll);

		 Prog1 z = new Prog1();
		 
		 String f = z.m1();           // this is practical way
		 System.out.println(f);
		 
		 
		 
		 System.out.println(z.m1());
		 System.out.println("..................................");
		 int add = sum(45, 45);
		 System.out.println("Addition of two number is="+add);     // you can call return method using two ways
		
		 System.out.println("Addition of two number is="+ sum(45, 100));
		 System.out.println("..................................");

		 int a = 100;
		 int b = mul();
		 int c = a*b;
		 System.out.println("multiply is ="+c);
		 System.out.println("..................................");
		 
		 String print = Ak("i am automation engneer ");
		 System.out.println(print);


	}

}
