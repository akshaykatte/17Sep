package Encapsultion;

public class Prog3 {
	private int rollNum ;
	 
	public void setRollno(int a)
	{
		rollNum=a;
	}
	public void getRollno()
	{
		System.out.println("Roll number of Student ="+rollNum);
	}
	public static void main(String[] args) {
		Prog3 z=new Prog3();
		z.setRollno(45);
		z.getRollno();
		

		
	}

}
