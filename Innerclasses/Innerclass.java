package Innerclasses;

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("innerclass");
		Innerclass o = new Innerclass();
		t7 obj = o.new t7();
		obj.main(args);

	}
	public class t7
	{
		public static void main(String[] args) {
			System.out.println("in t7");
		}
	}
	
}

