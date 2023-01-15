package ThisSuper;

public class Prog2 extends Prog1 {
	public Prog2()
	{
		this(25);
		super.add();
		System.out.println("this is constrructor");
	}
	public Prog2(int f)
	{
		System.out.println("value of A="+f);
	}

	
	public void add()
	{   
		System.out.println("this is addition method");
		System.out.println("vehical Number="+super.a);
	}

	public static void main(String[] args) {
		Prog2 h=new Prog2();
		h.add();
		h.run();

	}

}
