package Array;

import java.util.Arrays;
import java.util.Collections;

public class sortedArray {

	public static void main(String[] args) {
		
		          //Approch 1
//               int a[]= {70,20,30,90,10,50};
//               System.out.println("Before"+Arrays.toString(a));
//               Arrays.parallelSort(a);
//               System.out.println("after"+Arrays.toString(a));
//               
               //Approch 2
//               int a[]= {70,20,30,90,10,50};
//               System.out.println("before"+Arrays.toString(a));
//               Arrays.sort(a);
//               System.out.println("After"+Arrays.toString(a));
		
		     // Approch 
		Integer a[]= {70,20,30,90,10,50};
		System.out.println("before"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("assending"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());// collection Reverse order not supported primitive data type 
		//                                              thats why we use Integer
		 System.out.println("After desending"+Arrays.toString(a));

	}

}
