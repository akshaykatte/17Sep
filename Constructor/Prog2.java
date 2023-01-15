package Constructor;

public class Prog2 {
	public Prog2()
	{
		System.out.println("hi");
	}
	public Prog2(int a , int b)
	{
		int c;
		c=a+b;
		System.out.println("hi"+c);
	}
	public Prog2(boolean a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
             Prog2 a= new Prog2();
             Prog2 x= new Prog2(45,56);
             Prog2 k= new Prog2(true);

	}

}
