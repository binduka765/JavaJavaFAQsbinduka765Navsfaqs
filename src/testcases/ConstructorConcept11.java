package testcases;

public class ConstructorConcept11 {
	/*
	 * Constructor:
     *  is a class entity used to define some class features-in the form of global vars
     *  , while creating the object
     *  looks like a fn, BUT not a fn
     *  it cannot return any value
     *  its name should be same as class name
     *  no static, no return types
	 */
	
	public ConstructorConcept11() {
		System.out.println("Default constr...");
	};
	
	public ConstructorConcept11(int i) {
		System.out.println("single param constr...");
		System.out.println("the value of i "+i);
	}
	
	public ConstructorConcept11(int i, int j) {
		System.out.println("two param constr...");
		System.out.println("the value of i "+i);
		System.out.println("the value of j "+j);
		
		
	}

	public static void main(String[] args) {
		
		ConstructorConcept11 obj = new ConstructorConcept11();//calling default constr...
		ConstructorConcept11 obj1 = new ConstructorConcept11(10);
		ConstructorConcept11 obj2 = new ConstructorConcept11(10,20);
		

	}

}
