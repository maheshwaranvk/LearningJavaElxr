package learningEncapsulation;

public class Employee {
	
	private int Salary;
	private String emplName;
	
	//Encapsulated Method 1
	public int getSalary() {
		return Salary;
	}
	
	//Encapsulated Method 2
	public void setSalary(int salary) {
		this.Salary = salary;
	}
	
	//Encapsulated Method 3
	public String getEmplName() {
		return emplName;
	}
	
	//Encapsulated Method 4
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	
	

}
