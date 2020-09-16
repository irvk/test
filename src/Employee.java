
public class Employee {
	
	private String name;
	private String title;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Title: " + title);
	}

}
