package basicsJava;

public class LearningThisKeyword {
	
	private static String name; //Class Variable
	public LearningThisKeyword(String name) { // Argument Variable
		this.name = name;
	}
	
	/*
	 * this - keyword which is used to refer the class variable/method/object
	 */
	
	public static void main(String[] args) {
		LearningThisKeyword obj = new LearningThisKeyword("Mahesh");
		System.out.println(name);
	}

}
