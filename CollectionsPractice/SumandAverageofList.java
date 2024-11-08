package CollectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumandAverageofList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>(Arrays.asList(4, 5, 0, 9, 8, 10));
		int sum=0;
		double avg=0;
		int evenSum=0;
		for(int i:values)
		{
			sum+=i;
			if(i%2==0)
			{
				evenSum+=i;
			}
		}
		List<Integer> val = new ArrayList<Integer>();
		List<Integer> val2 = new ArrayList<Integer>();
		for(int i=0;i<values.size()/2;i++)
		{
			val.add(values.get(i));
		}
		for(int i=values.size()/2;i<values.size();i++)
		{
			val2.add(values.get(i));
		}
		List<Integer> overall = new ArrayList<Integer>();
		overall.addAll(val);
		overall.addAll(val2);
		System.out.println(overall);
		System.out.println(val);
		System.out.println(val2);
		avg=sum/values.size();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(evenSum);
		
		

	}

}
