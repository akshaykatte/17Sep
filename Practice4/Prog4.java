package Practice4;
// we can overload the one static and one non static method in java as follows
public class Prog4 {
	
	public void m1()
	{
		System.out.println("hi");
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m1(double b)
	{
		System.out.println(b);
	}
	public static void a1()
	{
		System.out.println("good morning");
	}
	public static void a1(int a ,int b)
	{
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		a1();
		a1(40, 54);
		Prog4 z = new Prog4();
		z.m1();
		z.m1(45612.23);
		z.m1(100);

	}

}
