package CollectionProg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProg {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		System.out.println("Is Empty="+a.isEmpty());
		System.out.println("size="+a.size());
		
		a.add(45);
		a.add("akshay");
		a.add("anuja");
		a.add("shital");
		a.add("ashwini");
		a.add(455.23);
		a.add("Satara");
		a.add("maharashtra");
		
		System.out.println("print all value="+a);

		System.out.println("Is Empty="+a.isEmpty());
		System.out.println("size="+a.size());
		a.add(4, "rajkanya");
		System.out.println("print all value="+a);
		
		for(int i=0;i<10;i++)
		{
			a.add(i);
		}
		System.out.println("print all value="+a);
         // a.addAll(5, a);
       System.out.println("is it shital="+a.contains("shital"));
       System.out.println("get 5th value="+a.get(5));
         a.remove(6);
   		System.out.println("print all value="+a);
        a.set(1, "akshay katte");
  		System.out.println("print all value="+a);
  		
        for(int i=0;i<a.size();i++)
        {
        	System.out.println(a.get(i));
        }
System.out.println("..........................................................");
System.out.println("size="+a.size());

            for(int i=a.size()-1;i>=0;i--)
               {
	           System.out.println(a.get(i));
                  }
            b.add(45);
            b.add(56);
            b.add(23);
            b.add(10);
            b.add(100);
            System.out.println(b);
            Collections.sort(b);
            System.out.println(b);


	}

}
