package Practice4;

import java.util.Scanner;


public class PracticeProg {
	
	public static void main(String[] args) {
		
//		int arr[]= {10,20,30,40,50};
//		
//		
//		for(int val:arr)
//		{
//			System.out.print(val + " ");
//		}
//		System.out.println(".......");
//		for (int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+"  ");
//		}
		
//		int a , b ,c;
//		System.out.println("Enter the value for the addition");
//		Scanner x = new Scanner(System.in);
//		a=x.nextInt();
//		b=x.nextInt();
//		c=a+b;
//		System.out.println("Addition is ="+ c);
//				
		int sizeOfArray ;
		System.out.println("Enter the size of array");
		Scanner a = new Scanner(System.in);
		sizeOfArray = a.nextInt();
		System.out.println("Size Of Array Is="+sizeOfArray);
		
		int mark[]= new int[sizeOfArray];
		System.out.println("Enter the elements of array");

		for(int i=0;i<sizeOfArray;i++)
		{
			mark[i]=a.nextInt();
			
		}
				System.out.println("mark is" );
		
		for(int v: mark)
		{
			System.out.println(v);
			
		}
		
	}

}
