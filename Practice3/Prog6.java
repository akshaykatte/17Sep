package Practice3;

public class Prog6 extends Prog5 implements Prog7 {
	@Override
	public void m1() {
		System.out.println("hi");
	}
	@Override
	public void add() {
System.out.println("work is going on properly");		
	}
	
	public static void main(String[] args) {
		
		Prog6 a=new Prog6();
		a.m1();
		a.run();
		a.add();

	}


	

	

}
