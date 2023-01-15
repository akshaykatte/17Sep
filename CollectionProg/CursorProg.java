package CollectionProg;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CursorProg {

	public static void main(String[] args) {
		
		Vector a = new Vector();
		  
		for(int i=0;i<20;i++) 
			a.add(i);
		System.out.println(a);
//		for(Object value:a)
//			System.out.println(value);
//		Enumeration e =a.elements();
//		while(e.hasMoreElements())
//		{
//		System.out.println(e.nextElement());
//		}
		Iterator z = a.iterator();
		while(z.hasNext())
		{
			int val=(int) z.next();
			if(val%2==0)
			System.out.println(val);
			else
				z.remove();
				
		}
	}

}
