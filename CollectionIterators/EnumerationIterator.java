package CollectionIterators;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
