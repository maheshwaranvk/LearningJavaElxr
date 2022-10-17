package basicsJava;

import java.util.Iterator;

public class LearningArrays {
	
	/*
	 * Adv --> 1. collection similar --> Group the Elements
	 * 			2. Code Optimization 
	 * 			3. Random Access
	 * 
	 * DisAdv --> Length cannot be changed
	 * 
	 */
	String name1 = "Mahesh"; //1kb
	String name2 = "Karthik";
	String name3 = "Kiran";
	String name4 = "Hari";
	String name5 = "Lokesh";
	//5kb --> 1kb
	
	private static void initArray1() {

		//FirstType
		//<dataType> <variableName> [] = new <dataType>[length]; --> Syntax of the Array
		
		String emplName [] = new String [5]; //Creating an Array
		
		emplName[0] = "Kiran";
		emplName[1] = "Lokesh";
		emplName[2] = "Hari";
		emplName[3] = "Mahesh";
		emplName[4] = "Karthik";
		
		/*
		 * System.out.println(emplName[0]); System.out.println(emplName[1]);
		 * System.out.println(emplName[2]); System.out.println(emplName[3]);
		 * System.out.println(emplName[4]);
		 */
		
		//Loops --> for
		System.out.println("Executing via Loops");
		for(int i=0; i<emplName.length ; i++) {
			System.out.println(emplName[i]);
		}
		
		int [][]a = new int [2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;

	}
	
	private static void initArray2() {
		
		int emplId [] = {34,56,12,34,89}; //2nd Type of Init of Arrays

		for(int i=0; i<emplId.length ; i++) {
			System.out.println(emplId[i]);
		}
		
		int arr[][] = {{10,20},{30,40}};
	}
	
	public static void main(String[] args) {
		initArray1();
		initArray2();
	}
	
	
	
	

}
