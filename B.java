
public class B extends A {
	
//	public static void m(String s)
//	{
//		System.out.println("child");
//	}
	

	public void nsmethod1(String s) {
		System.out.println("I am ns from c");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		m("hi");
		b.nsmethod1("hi");
		
		A a =new A();
		a.nsmethod1("hi1");

	}

}
