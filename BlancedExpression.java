

public class BlancedExpression  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp ="{}";
		if(exp.isEmpty())
		{
			System.out.println("false");
			return;
		}
		System.out.println(matching(exp));
		

	}
	public static boolean matching(String exp)
	{
		int openCount=0,closeCount=0;
		for(int i=0;i<exp.length();i++)
		if(exp.charAt(i)=='{'||exp.charAt(i)=='('||exp.charAt(i)=='[')
		{
			openCount++;
		}
		else if(exp.charAt(i)=='}'||exp.charAt(i)==')'||exp.charAt(i)==']')
		{
			closeCount++;
		}
		else
		{
			return false;
		}
		
		if(openCount==closeCount)
		{
			return true;
		}
		else
			return false;
		
	}

}
