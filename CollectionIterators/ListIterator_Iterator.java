package CollectionIterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Iterator {
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> v = new ArrayList<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		ListIterator<Integer> i = v.listIterator();
		String s="m333";
		String s1="m";
		System.out.println(s.hashCode() +" "+s1.hashCode());
		while(i.hasNext())
		{
			System.out.println(i.next()+":"+i.nextIndex());
			
		}
		System.out.println(c);
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		

	}

}
