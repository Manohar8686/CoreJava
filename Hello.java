
public class Hello implements Vehicle{


	@Override
	public void start() {
		System.out.println("Hii");
	}
	
	public static void method1()
	{
		System.out.println("I am from parent");
	}

}
class Hello1 extends Hello
{
	public static void method1()
	{
		System.out.println("I am from child");
		
	}
	public static void main(String[] args)
	{
		Hello1 h = new Hello1();
		
	     h.method1();
	}
}
