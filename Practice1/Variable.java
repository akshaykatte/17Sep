package Practice1;

public class Variable {

	public  void data()
	{
		// variable declaration
		String name      = "Akshay";
		int      age       = 25;
		int          id        = 101;
		String       company   = "XYZ";
		double          salary    = 50000.50;
		String       address   = "Maharashtra";
		        
		
		
		
		// variable usage
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Id="+id);
		System.out.println("Company="+company);
		System.out.println("Salary="+salary);	
		System.out.println("Address="+address);
	}
		
		public static void main(String[] args) {
			Variable akshay = new Variable ();
			akshay.data();
	}
	

}
