package Abstraction;

public class Prog2 extends AbstractionProg1 {

	

@Override
public void method1() 
{
	
	System.out.println("this is abstraction method ");
}

	public static void main(String[] args) {
		Prog2 a = new Prog2();
		a.method();
		a.method1();

}
}