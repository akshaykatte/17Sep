package Polymorphism;

public class PolyProg {
// method overloading
	public void add()
	{
		int a, b, c;
		a=45;
		b=89;
		c=a+b;
		System.out.println("sum="+c);
	}
	public void add(int a)
	{
		System.out.println("Sum="+a);
		
	}
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum="+c);
	}
	public void add(double a)
	{
		double c;
		c=a+a;
		System.out.println("sum="+c);
	}
	public static void main(String[]args) {
		PolyProg z=new PolyProg();
		z.add();
		z.add(45);
		z.add(45, 45);
		z.add(45265.23);
		
	}
}
