package Encapsultion;

public class Prog2 {
// Encpsulation
	private String Employe;
	public void run(String name)
	{
		Employe=name;
		
	}
     public void cat()
     {
    	 System.out.println("Name of the Employee="+Employe);
     }
public static void main(String[]args) {
	Prog2 k=new Prog2();
	k.run("akshay");
	k.cat();
	
}



}
