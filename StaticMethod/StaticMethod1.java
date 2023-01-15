package StaticMethod;

public class StaticMethod1 {
	// static method from same class
	public static void run()
	{
		System.out.println("static method from same class");
	}
	
	// static method with parameter from same class
	public static void addition(int a ,int b)
	{
		int c=0;
		c=a+b;
		System.out.println("Addition is="+c);
	}
	
	// non-static method call from same class
	public void add()
	{
		System.out.println("non-static method call from same class");
	}
	
	//Non-Static	method	with	parameter	in same	class
	public void multiply(int a , int b)
	{
		int c=0;
		c=a*b;
		System.out.println("multiply="+c);
	}
	
	

	public static void main(String[] args) {
		run();
		addition(10, 20);
		StaticMethod1 a=new StaticMethod1();
          a.add();
          a.multiply(22,44);
          System.out.println("______________________________________________");
          StaticMethod2.show();
          StaticMethod2.info("Akshay","satara");
          StaticMethod2 abc=new StaticMethod2();
         abc.sum();
         abc.div(10 , 5);
	}

}
