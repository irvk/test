
public class Company {
	
	private Employee[] employees = new Employee[3];
	private int employeeIndex = 0;
	
	public void addEmployee(Employee employee) {
		
		employees[employeeIndex] = employee;
		employeeIndex++;
		
	}
	
	public void print() {
		for(int i = 0; i < employees.length; i++) {
			employees[i].print();
			System.out.println("======================================");
		}
		System.out.println("The size of the company: " + employees.length);
	}
	
}
