package Practice1;

public class ForLoop {
	public static void main(String[]args) {
		// for loop
		//print 1 to 5 no
		//Print	number	from	55-75
		//Print	even	number	from	2-10
		//Print	odd	number	from	5-51
		//Print	number	5	to	1
		//Print	even	number	from	100	to	2
		//Print	odd	number	from	9	to	1
		//- Print	cube	of	values	from	1	to	5
		//for(int i=1;i<=5;i++)
		int mark = 90;
		if(mark >=40 && mark <60)
		{
			System.out.println("second class");
			
		}
		else if(mark >=60 && mark <75)
		{
			System.out.println("first class");
		}
		else if (mark >=75 && mark<90)
		{
			System.out.println("distinction");
		}
		else if (mark >=90 &&  mark <=100)
		{
			System.out.println("merit");
		}
		else if (mark>100)
		{
			System.out.println("invalid");
		}
		
		else
		{
			System.out.println("fail");
		}
	}

}
