
public interface Bike {
	
	public void start();
	
	default void hi() {
		System.out.println("Bike ..");
	}
}
