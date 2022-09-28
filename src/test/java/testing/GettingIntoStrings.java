package testing;

public class GettingIntoStrings {

	public static void main(String[] args) {
		String name = "Mahesh";

		String name2 = name + "waran";

		name.concat("waran");
		System.out.println(name);

		StringBuilder obj = new StringBuilder("Siva");
		obj.append("ranjini");

		System.out.println(obj);
	}

}
