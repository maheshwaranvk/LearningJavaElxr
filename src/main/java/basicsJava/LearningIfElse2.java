package basicsJava;

public class LearningIfElse2 {
	
	int a = 100, b=200 , c=500;
	
	public void compareValues() {
		/*
		 * If a>b and a>c, print "Value A is Greater than B&C" - Condition 1
		 * else If, b>a and b>c, print "Value B is Greater than A&C" - Condition 2
		 * else "Value C is Greater than A&B" - Default Condition
		 * 
		 * if(condition){statements;
		 * }
		 * elseif(condition){statements;
		 * }
		 * else{statements;}
		 */
		
		if (a>b && a>c) { //&& is the Logical Operator
			System.out.println("Value A is Greater than B&C");
		}
		
		else if (b>a && b>c) {
			System.out.println("Value B is Greater than A&C");
		}
		
		else {
			System.out.println("Value C is Greater than A&B");
		}

	}
	
	public static void main(String[] args) {
		
		LearningIfElse2 obj = new LearningIfElse2();
		obj.compareValues();
		
	}

}
