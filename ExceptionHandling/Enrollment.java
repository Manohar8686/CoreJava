package ExceptionHandling;

import java.util.Scanner;

public class Enrollment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		age = sc.nextInt();
		
		try
		{
			if (age < 18) {
				throw new NotEligible("hey you were age was below 18");
				
			}
			else if(age>60)
			{
				throw new AgeExceeded("hey you are hitted max age limit");
			}
			else if(age>=18 || age<=60)
			{
				throw new MeetsEligibility("hey you r perfect match for this role");
			}
			else
			{
				throw new Sorry("sry u r not meeting our criteria");
			}
		}
		catch ( NotEligible | AgeExceeded | MeetsEligibility | Sorry e)
		{
			System.out.println(e.getMessage());
		}
			
		finally
		{
			
				sc.close();
			}
		}

	}


