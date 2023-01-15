package Veriable;

public class LocalVariable {
	 int a=10;
	 static int b=45;
	 public void sum()
	 {
		 a++;
		 b++;
		 System.out.println(a + "   "+b);
	 }
	 public static void main(String[] args) {
			LocalVariable x=new LocalVariable();
			x.sum();
			LocalVariable y=new LocalVariable();
			y.sum();
			
	 }

}
