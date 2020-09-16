
public class main {
	public static void main(String[] args) {
		
		Company company = new Company();
		
		Employee one = new Employee();
		one.setName("Jason Bourne");
		one.setTitle("Intern");
		
		Employee two = new Employee();
		two.setName("James Bond");
		two.setTitle("Manager");
		
		Employee three = new Employee();
		three.setName("Tom Cruise");
		three.setTitle("Supervisor");
		
		company.addEmployee(one);
		company.addEmployee(two);
		company.addEmployee(three);
		
		company.print();
	}
}
