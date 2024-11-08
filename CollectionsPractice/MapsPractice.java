package CollectionsPractice;
import java.util.*;
public class MapsPractice {

	public static void main(String[] args) {
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		map.put('a', 1);
		map.put('b', 2);
		System.out.println(map.get('c'));
		int v1=map.getOrDefault('a', 0);
		int v2=map.getOrDefault('c', 0);
		System.out.println(v1 +"  "+v2);
		
		
		

	}

}
