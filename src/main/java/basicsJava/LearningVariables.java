package basicsJava;

public class LearningVariables {
	
	int c=15, d=20,e = 30; // Global Variables
	//Public Transport
	
	public void add() {
		int a=5, b=10; // Local Variables  //Private Transport
		System.out.println(a+b);
		System.out.println(a+e);
	}
	
	public void sub() {
		
		System.out.println(d-c);
		System.out.println(e-d);
	}
	
	public static void main(String[] args) {
		LearningVariables obj = new LearningVariables();
		obj.add();
		obj.sub();
	}
}
