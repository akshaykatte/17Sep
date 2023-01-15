package Abstraction;

public class Prog3 implements Prog1  {

	@Override
	public void m1() {
		System.out.println("this is interface method");
	}

	@Override
	public void m2() {
System.out.println("akshay santosh katte at post gondawale bk tal man dist satara ");		
	}

	@Override
	public void m3() {
System.out.println("i am an automation software engineer i have two year experience in software testing currently working in mnc company");		
	}
public static void main(String[]args) {
	Prog3 y = new Prog3();
	y.m1();
	y.m2();
	y.m3();
}
}
