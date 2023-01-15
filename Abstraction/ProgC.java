package Abstraction;

public class ProgC extends ProgB {

	@Override
	public void name() {
		System.out.println("hi");
		
	}
	public static void main(String[] args) {
		ProgC a=new ProgC();
		a.method();
		a.method2();
		a.name();
	}
	

	
	
}
