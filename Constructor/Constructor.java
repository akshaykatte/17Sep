package Constructor;
// constructor overloading
public class Constructor {
	public Constructor()
	{
		System.out.println("hi");
	}
	public Constructor(int a , int b)
	{
		int c;
		c=a+b;
		System.out.println("Value of a="+c);
	}
	public Constructor(double a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		Constructor z=new Constructor();
		Constructor x=new Constructor(12 , 41);
		Constructor y=new Constructor(45612.23);
	}

}
