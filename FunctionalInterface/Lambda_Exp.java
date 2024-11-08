package FunctionalInterface;

public class Lambda_Exp {

	public static void main(String[] args) {
		
		/*
		 * Using anonymous class
		 */
		Car c = new Car()
				{

					@Override
					public void drive() {
						// TODO Auto-generated method stub
						System.out.println("In hyundai");
						
					}
			
				};
				/*
				 * Traditional of using interface
				 * @Author Manohar
				 */
	
		Audi a = new Audi();
		a.drive();
		c.drive();
		/*
		 * using Lambda exp with anonymous function
		 */
		Car c2 = () ->
		{
			System.out.println("in tata");
		};
		c2.drive();

	}

}


class Audi implements Car
{

	@Override
	public void drive() {
		System.out.println("In Audi");
		
	}
	
}

@FunctionalInterface
interface Car
{
	void drive();
}
