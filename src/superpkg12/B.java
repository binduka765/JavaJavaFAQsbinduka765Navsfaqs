package superpkg12;

public class B extends A{
	
	public B() {
		//super(10);
		super(20, 30);
		System.out.println("child class constr...");
	}
	
	public static void main(String[] args) {
		B obj = new B();
	}

}
