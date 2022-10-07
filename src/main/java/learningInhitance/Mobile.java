package learningInhitance;

public class Mobile extends Calculator{
	
	public void call() {
		System.out.println("Inside Mobile.Call");
	}
	
	public void msg() {
		System.out.println("Inside Mobile.msg");
	}
	
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.call();
		obj.msg();
		obj.add();
		obj.sub();
	}

}
