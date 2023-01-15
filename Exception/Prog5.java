package Exception;

public class Prog5 {

	public static void main(String[] args) {
	//multiple try block 
		try {
			String str=null;
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException a)
		{
			System.out.println(a);
		}
		try {
			System.out.println("result"+(10/5));
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
		try {
			int arr[]= {4,5,6,2,5,6};
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException c)
		{
			System.out.println(c);
		}
	}

}
