package Array;

public class Prog2 {
// array revese number...
	public static void main(String[] args) {
		
		int num[]= {10,20,30,50,40,60,70,80,90};
		System.out.println("length of array ="+num.length);
		for (int result:num)
		{
			System.out.println(result);
		}
		System.out.println(".....................");

			for (int i=8;i>=0;i--)
			{
				System.out.println(num[i]);
			}
			
	}

}
