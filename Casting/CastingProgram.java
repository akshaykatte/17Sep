package Casting;

public class CastingProgram {

	public static void main(String[] args) {
       // implicite casting
		int a=41;
		System.out.println("A="+a);
		double b=a;
		System.out.println("B="+b);
		//Explicit casting
		double c=45.63;
		System.out.println("C="+c);
		int d=(int)c;
		System.out.println("D="+d);
	}

}
