
public class C implements Bike,Vehicle{
	
	

	public static void main(String[] args) {
		
	}

	@Override
	public void hi() {
		Vehicle.super.hi();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		new C().hi();
		
	}

}
