package basicsJava;

public class LearningAccessModifiers {
	
	/*
	 * private - scope within the class
	 */
	
	private static String name ="Elixr"; 
	
	private static void display() {
		System.out.println("I am inside display()");
	}
	
	
/*
 * public - scope is outside the class also
 * default - scope is within the package
 * protected - inside & outside package with inheritance
 * 
 */
	
	static String name2 ="Elixr Labs";
	
	void display2() {
		System.out.println(name);
		System.out.println(name2);

	}
	
	static void display3() {
		System.out.println(name);
		System.out.println(name2);

	}
	
	protected static String name3 = "Elixr Lab Technologies";
	
	public static void main(String[] args) {
		System.out.println(name); // using/calling the variable
		display();
		//display2();
		
		LearningAccessModifiers obj = new LearningAccessModifiers();
		obj.display2(); //calling non static method
		
		display3();
	}
	

}
