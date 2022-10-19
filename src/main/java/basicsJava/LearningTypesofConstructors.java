package basicsJava;

public class LearningTypesofConstructors {
	
	//DefaultConstructor
	public LearningTypesofConstructors() {
		System.out.println("Inside Constructor");
	}
	
	//Parametrized Constructor
	public LearningTypesofConstructors(String name) {
		System.out.println("Inside "+name);
	}
	
	public LearningTypesofConstructors(int a, int b) {
		System.out.println(a+b);
	}
	
	private void display() {
		System.out.println("Inside Display Method");
	}
	
	public static void main(String[] args) {
		LearningTypesofConstructors obj = new LearningTypesofConstructors();
		LearningTypesofConstructors obj2 = new LearningTypesofConstructors("Parametrized Constructor");
		
		LearningTypesofConstructors obj3 = new LearningTypesofConstructors(5, 10);
		
		obj3.display();
		obj2.display();
		obj.display();
	}

}
