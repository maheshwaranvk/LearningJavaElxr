package basicsJava;

public class LearningStringBuffer {
	public static void main(String[] args) {
		
		System.out.println("String Examples");
		String name ="Elixr"; // Class 1 --> Class 4, Class 10, Class 34 --> 1kb
		System.out.println(name.concat("Labs")); // 2kb --> 1mb
		System.out.println(name); // Immutability of String
		
		String userId ="sender";
		String password = "bd";
		
		System.out.println(userId + " is the userId");
		System.out.println(password + " is the password");
		
/*-----------------------------------------------------------------------------*/
		
		/*
		 * StringBuffer - another class which supports all the string operations with mutability
		 */
		System.out.println();
		System.out.println("String Buffer Examples");
		
		StringBuffer cName = new StringBuffer("Elixr"); //1.0
		System.out.println(cName.append("Labs"));
		System.out.println(cName);
		
		System.out.println();
		System.out.println("String Builder Examples"); //1.5
		StringBuilder companyName = new StringBuilder("Elixxr");
		System.out.println(companyName.append("Labs"));
		System.out.println(companyName);
		
	}

}
