package CollectionsPractice;

import java.util.Arrays;
import java.util.TreeSet;

public class CGI_Interview_qst {

	public static void main(String[] args) {
		 Integer[] numbers = {
		            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
		            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
		            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
		            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
		            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
		            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
		            41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
		            41, 42, 43, 44, 45, 46, 47, 48, 49, 50
		        };
		 TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(numbers));
		  Object arr[] = ts.toArray();
		 
		 System.out.println(arr[4]);
		 

	}

}
