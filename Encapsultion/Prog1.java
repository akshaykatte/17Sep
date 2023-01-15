package Encapsultion;

public class Prog1 {
	private String PersonName;
	 
	public void getname(String name)
	{
		PersonName=name;
	}
	public void setname()
	{
		System.out.println("Name of the person="+PersonName);
	}

	public static void main(String[] args) {
		Prog1 a=new Prog1();
		a.getname("Akshay");
		a.setname();
		

	}

}
