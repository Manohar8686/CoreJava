package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inputfromconsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> l = new ArrayList<>();
		
		while(true)
		{
			String input = sc.nextLine();
			if("exit".equalsIgnoreCase(input))
			{
				break;
			}
			l.add(input);
		}
		System.out.println(l);
	}

}
