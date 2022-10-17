package learningInhitance;

public class Car extends Mobile{
	
	public void drive() {
		System.out.println("Inside Car.driver");
	}
	
	public static void main(String[] args) {
		Car obj2 = new Car();
		obj2.drive(); // method of Car
		obj2.add();// method of Calculator
		obj2.call();// method of Mobile
	}
}
