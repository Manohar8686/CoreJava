package MultiThreading;

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		
		/* Using implementation
		 * Employee e1 = new  Employee();
		 * Thread t1 = new Thread(e1);
		 */
		Employee e1 = new Employee();
		Manager m1 = new Manager();
		
		e1.start();
		m1.start();
		//Lambda exp
		Runnable r1 = () -> System.out.println("user"+Thread.currentThread().toString());
		Thread t1 = new Thread(r1);
		t1.start();
		//For creating multi threading we have 4 ways
		
		

	}

}

class Employee extends Thread implements Runnable
{
	public void run() {
		System.out.println("Emp"+Thread.currentThread().toString());
	}
}

class Manager extends Thread
{
	public void run() {
		System.out.println("Manager"+Thread.currentThread().toString());
	}
}
