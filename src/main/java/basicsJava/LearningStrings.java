package basicsJava;

import java.util.Arrays;

public class LearningStrings {
	
	public static void main(String[] args) {
		
		//How to initialize a String
		//2 ways
		//String Literals
		String str = "Elixr";
		String str2 = "Labs";
		String str3 = "Elixr";
		
		//str==str3
		//Using Objects
		String obj = new String("Elixr Labs");
		String obj2 = new String("Elixr Labs");
		
		//obj<> obj2
//		System.out.println(str==str3);
//		System.out.println(obj==obj2);
		
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.toCharArray()); // "Elixr" --> {'E','l','i','x','r'}
		
		String word = "Country";
		System.out.println(word.substring(2, 5));
		
		String sentence = "I!like!Biriyani"; // 'I', "like" , "Biriyani"
		System.out.println(Arrays.toString(sentence.split("!")));
		
		
	}

}
