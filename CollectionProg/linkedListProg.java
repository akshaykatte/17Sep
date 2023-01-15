package CollectionProg;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedListProg {

	public static void main(String[] args) {
		
		LinkedList a =new LinkedList();
		LinkedList b =new LinkedList();
		
		System.out.println(a.size());
		System.out.println(b.size());
		
		a.add("akshay katte");
		a.add("anuja");
		a.add("ashwini");
		a.add("Gondawale");
		a.add("satara");
		a.add('A');
		a.add('+');
		a.add(1200);
		a.add(45.23);
		a.add(null);
		
		System.out.println(a);
        a.add(5, "tcs");
		System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.get(5));
        a.poll();
		System.out.println(a);
		a.pollLast();
		System.out.println(a);
        a.remove();
		System.out.println(a);
		a.removeLast();
		System.out.println(a);


        
        
	}

}
