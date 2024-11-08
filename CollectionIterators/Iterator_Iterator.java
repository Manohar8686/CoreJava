package CollectionIterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		Iterator<Integer> i = v.iterator();
		while(i.hasNext())
		{
		   System.out.println(i.next());
		}
		
				

	}

}
