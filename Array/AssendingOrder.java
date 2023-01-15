package Array;

import java.util.Arrays;

public class AssendingOrder {

	public static void main(String[] args) {
		int num[]= {10,80,25,56,15};
		//System.out.println(Arrays.toString(num));
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println("......................");
		int temp;

		for(int i=0;i<num.length;i++)
		{
			for(int j=i;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}

}
