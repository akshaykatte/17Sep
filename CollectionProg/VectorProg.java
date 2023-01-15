package CollectionProg;

import java.util.Vector;

public class VectorProg {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int a=0;a<11;a++)
		{
			v.add(a);
		}
		System.out.println(v);
		System.out.println(v.capacity());

	}

}
