package basicsJava;

public class LearningStaticandNonStatic {

	String name; // Non Static Variable
	String rollNo;// Non Static Variable
	static String collName = "ABC";// Static Variable
	
	//static Block
	static {
		String collAddress ="Chennai";
		String collNumber = "3456B";
		int collID = 345;
	}

	// Non Static method - displayStudent()
	public void displayStudent(String name, int rollNo) {
		System.out.println("Name of the Student : " + name);
		System.out.println("Roll Number of the Student : " + rollNo);
		System.out.println("College Name of the Student : " + collName);
		
	}

	// Static method - display2()
	public static void display2(String name, int rollNo) {
		System.out.println("Name of the Student : " + name);
		System.out.println("Roll Number of the Student : " + rollNo);
		System.out.println("College Name of the Student : " + collName);
		
		String lname ="Peter";
	}

	public static void main(String[] args) {
		LearningStaticandNonStatic obj = new LearningStaticandNonStatic();
		obj.displayStudent("Peter", 111); // Calling Non Static Method
		// Accesing static variable
		// direct calling
		System.out.println(collName);
		// classname.variablename
		System.out.println(LearningStaticandNonStatic.collName);

		display2("John", 222); // Calling Static Method
		LearningStaticandNonStatic.display2("Thomas", 333);

	}

}
