package CollectionsPractice;

public class Employee {

     private String name;
     private double salary;
     private String country;
     public Employee()
     {
    	 
     }
	public Employee(String name, double salary, String country) {
		super();
		this.name = name;
		this.salary = salary;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}
     
}
