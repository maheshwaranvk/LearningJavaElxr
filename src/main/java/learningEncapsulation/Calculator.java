package learningEncapsulation;

public class Calculator {
	
	public static void main(String[] args) {
		Operations obj = new Operations();
		
		int a = 10, b = 20;
		System.out.println(a+b);
		System.out.println(obj.add(a, b));
	}

}
