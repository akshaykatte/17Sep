package StaticMethod;

public class Prog3 {
	public static void Employe(String Name,int id,double salary,String City,String address)
	{
        
	
		System.out.println("A="+ Name);
		System.out.println("B="+ id);
		System.out.println("C="+ salary);
		System.out.println("D="+ City);
		System.out.println("E="+ address);
	}
	public static void main(String[] args) {
		
		Employe("Akshay",4780,50000.25,"Satara","Gondawale bk");
	}

}
