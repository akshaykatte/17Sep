package Array;

public class Prog1 {

	public static void main(String[] args) {

		String array[]=new String[5];
		array[0]="A";
		array[1]="B";
		array[2]="C";
		array[3]="D";
		array[4]="E";
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println("...........................");
		 for(int i=0;i<5;i++)
		 {
                  System.out.print(array[i]+" ");
		 }
		System.out.println(array.length);
		
		
		
	}

}
