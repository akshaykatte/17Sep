package CollectionProg;

import java.util.HashSet;

public class HashSetProg {

	public static void main(String[] args) {
		
		HashSet a = new HashSet();
		a.add("akshay");
		a.add("santosh");
		a.add("katte");
		a.add("satara");
		a.add("Gondawale");
		a.add(89);
		a.add(99);
		a.add(89);
		a.add(47);
		a.add(80);
		System.out.println(a);
	    System.out.println(a.size());
	    for(int i=0;i<10;i++)
	    {
	    	a.add(i);
	    	
	    }
		System.out.println(a);
	    System.out.println(a.size());
       a.add(null);
       System.out.println(a);
       a.add(null);
       System.out.println(a);
	}

}
