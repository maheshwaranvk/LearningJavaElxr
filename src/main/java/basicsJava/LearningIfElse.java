package basicsJava;

public class LearningIfElse {
	
	int a = 100, b=20;
	
	public void compareValues() {
		/*
		 * If a>b, print "Value A is Greater than B"
		 * else, Print "Value B is Greater than A"
		 * 
		 * if(condition){statements;
		 * }
		 * else{statements;
		 * }
		 */
		
		if (a>b) {
			System.out.println("Value A is Greater than B");
		}
		else {
			System.out.println("Value B is Greater than A");
		}

	}
	
	public static void main(String[] args) {
		
		LearningIfElse obj = new LearningIfElse();
		obj.compareValues();
		
	}

}
