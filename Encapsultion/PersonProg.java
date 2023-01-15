package Encapsultion;

public class PersonProg {
	private int accNo;
	
	public void setNumber(int a)
	{
		accNo=a;
	}
	public void getNumber()
	{
		System.out.println("customer account number is="+accNo);
	}

	public static void main(String[] args) {
		PersonProg z = new PersonProg();
		
		z.setNumber(456269525);

		z.getNumber();

		

	}

}
