package ThisMethod;

public class Prog2 extends Prog1 {
	int b=75;
	public Prog2 ()
	
	
	{
		
		super(4);
		System.out.println("hi good morning");
		
	}
	public void run()
	{
		
		System.out.println("akshay="+b);
		System.out.println("katte="+super.a);
	}
	public Prog2(char a)
	{
		this(true);
		System.out.println("grade="+a);
	}
	public Prog2(boolean a)
	{
		System.out.println("H="+a);
	}
	public static void main(String[] args) {
		Prog2 k=new Prog2();
		k.run();
		Prog2 v=new Prog2('A');
	}

}
