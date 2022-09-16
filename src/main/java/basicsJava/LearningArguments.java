package basicsJava;

public class LearningArguments {
	
	public void display(String display) {//argument
		System.out.println("My Company name is "+ display);
	}
	
	public void add(int a , int b) {
		System.out.println("Addition of two variable is " + (a+b));
	}

	public static void main(String[] args) {
		String name = "Elixr Labs";  //Local Variable
		
		LearningArguments obj = new LearningArguments();
		obj.display(name);
		obj.display("MobileHeartBeat");
		obj.add(10, 30);
		
	}

}
