package Exception;

public class Prog3 {

	public static void main(String[] args) {
		 System.out.println("...................");
		try {
			System.out.println("result"+(10/0));
		}
		
		catch (Exception Z) {
			System.out.println("exception are due to"+Z);
		}	
		
	}

}
