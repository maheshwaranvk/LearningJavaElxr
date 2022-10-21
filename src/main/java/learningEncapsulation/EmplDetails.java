package learningEncapsulation;

public class EmplDetails {
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		
		obj.setEmplName("Ajith");
		obj.setSalary(10000);
		
		System.out.println("Employee Name is "+obj.getEmplName()+
				" and Salary is "+ obj.getSalary());
	}

}
