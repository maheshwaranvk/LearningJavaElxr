package basicsJava;

public class LearningMethodOverloading {
	
	private void add(int a , int b) { //2 arguments
		System.out.println("Addition of two vairables : " +
						(a+b)
						);
	}
	
	private void add(int a , int b, int c) { //3 arguments
		System.out.println("Addition of two vairables : " +
						(a+b+c)
						);

	}
	
	private void add(String display) {
		System.out.println(display);

	}

	public static void main(String[] args) {
		LearningMethodOverloading obj = new LearningMethodOverloading();
		obj.add(10, 30);
		obj.add(10, 30,40);
		obj.add("Addition is not Possible");

	}

}
