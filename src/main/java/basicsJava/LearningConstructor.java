package basicsJava;

public class LearningConstructor {
	
	public LearningConstructor() {
		System.out.println("I am inside Constructor");
	}
	
	private void display() {
		System.out.println("Displaying the display method");
	}
	
	private void displayNothing() {
		System.out.println("Display Nothing Method");
	}
	
	public static void main(String[] args) {
		LearningConstructor obj = new LearningConstructor();
		
		obj.display();
		obj.displayNothing();
	}

}
