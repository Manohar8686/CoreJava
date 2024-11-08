package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistration  {

	public static void main(String[] args) {
		Employee e1= new Employee("Mano", 31250.86, "India");
		Employee e2 = new Employee();
		e2.setName("Manohar");
		e2.setSalary(10250.88);
		e2.setCountry("USA");
		Employee e3 = new Employee("Sai", 42560.99, "India");
		
		List<Employee> data = new ArrayList<>();
		data.add(e1);
		data.add(e2);
		data.add(e3);
		
		double sum=0;
		
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i).getCountry()=="India")
			{
				sum+=data.get(i).getSalary();
			}
		}
		System.out.println(sum);
		

	}

}
