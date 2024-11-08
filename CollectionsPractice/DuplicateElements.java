package CollectionsPractice;

import java.util.*;

public class DuplicateElements {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(Arrays.asList("m", "s", "c", "m","c","d","a","e","f","h"));
		List<String> duplicate = new ArrayList<String>();
		List<Integer> counts = new ArrayList<Integer>();
		List<String> nonduplicate = new ArrayList<String>();
		
		
		for(String name : names) 
		{
			int count=0;
			if(!duplicate.contains(name))
			{
			for(String check : names)
			{
				if(check.equalsIgnoreCase(name))
				{
					count++;
				}
			}
			}
			if(count>1)
			{
				duplicate.add(name);
				counts.add(count);
				
			}
			
			
			
		}
		names.removeAll(duplicate);
		System.out.println(names);
		for(int i=0;i<duplicate.size();i++)
		{
			System.out.println(duplicate.get(i)+":"+counts.get(i)+names.indexOf(duplicate.get(i)));
		}
		

	}

}
