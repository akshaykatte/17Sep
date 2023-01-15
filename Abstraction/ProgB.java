package Abstraction;

public abstract class ProgB extends ProgA {

	@Override
	public void method2() {
		int a=12;
		int b=12;
		int c=a+b;
		System.out.println("Addition is="+c);
		
		
	}
	public abstract void name();

}
