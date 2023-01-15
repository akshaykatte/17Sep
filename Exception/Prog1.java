package Exception;

public class Prog1 {

	public static void main(String[] args) {
		System.out.println("start");
        int a=10,b=0,c=0;
        try {
        c=a/b;
        }
      catch (Exception z)
        {
        	System.out.println("Problem");
        }
         
        System.out.println("Result="+c);
        System.out.println("end");
	}

}
