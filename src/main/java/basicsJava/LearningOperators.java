package basicsJava;

public class LearningOperators {
	
	public void add() {
		int a = 10, b = 20, c;
		c = a+b; // Assignment Operator
		System.out.println(c); //addition operator
	}
	
	public void sub() {
		int a = 10, b = 20;
		System.out.println(b-a); //subraction operator
	}
	
	public void mul() {
		int a = 10, b = 20;
		System.out.println(a*b); //* is the multiplication operator
	}
	
	public void div() {
		int a = 20, b = 3;
		System.out.println(a/b); // '/' will provide the Numerator
	}
	
	public void div2() {
		int a = 20, b = 3;
		System.out.println(a%b); // '%' will provide the Denominator
	}
	
	public void compareTwoVariables() {
		int a = 10, b = 20;
		System.out.println(a<b); // true
		System.out.println(a>b); // false
		System.out.println(a!=b); // true
		System.out.println(a==b); // false

	}
	
	public static void main(String[] args) {
		
		LearningOperators obj = new LearningOperators(); //Creating the Object
		
		//Calling the Methods
		obj.add(); //30
		obj.sub(); //10
		obj.mul(); //200
		obj.div(); //6
		obj.div2(); //2
		obj.compareTwoVariables();
	}
}
