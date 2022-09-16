package basicsJava;

public class Car {
	String carColor = "red"; //variable 1
	String carMode = "manual"; //variable 2
	public int carMileage = 34; //variable 3
	
	//carMileage = "Elixr";
	
	//method 1
	public void driveFast() {
		System.out.println("I am inside driveFast");
		System.out.println("My Mileage is "+carMileage);
	}
	
	//method 2
	public void soundHorn() {
		System.out.println("I am inside Sound Horn method");
		System.out.println("My Car Type is "+ carMode);

	}

	public static void main(String[] args) {
		
		//Create an Object to this Class
		// ClassName objectName = new ClassName(); --> new is the keyword
		
		Car bmw = new Car(); //Object 1
		
		//Access method in class --> objectName.methodName();
		bmw.driveFast(); //method 1
		bmw.soundHorn(); //method 2
		
		System.out.println("My Car Color is "+ bmw.carColor);

	}

}
