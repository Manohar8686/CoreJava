
public interface Vehicle{
	
	public void start();
	
	default void hi() {
		System.out.println("Vehicle ..");
	}

}
