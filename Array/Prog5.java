package Array;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
//            int arraySize=5;
//            int arr[]=new int[arraySize];
//             arr[0]=45;
//             arr[1]=46;
//             arr[2]=47;
//             arr[3]=48;
//             arr[4]=49;
//
//             for(int val:arr)
//            	 System.out.println(val);
//             
             int arraySize;
             System.out.println("Enter the size of array");
             Scanner v=new Scanner(System.in);
             arraySize=v.nextInt();
             System.out.println("Size of array is"+arraySize);
              
             int mark[]=new int[arraySize];
             System.out.println("enter the element of array");
             for(int i=0; i<arraySize;i++)
             {
            	 mark[i]=v.nextInt();
             }
             System.out.println("Array values are");
             for(int a:mark)
            	 System.out.print(a +" ");
	}

}
