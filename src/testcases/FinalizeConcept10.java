package testcases;

public class FinalizeConcept10 {
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		FinalizeConcept10 f1 = new FinalizeConcept10();
		FinalizeConcept10 f2 = new FinalizeConcept10();
		
		//creates two objects f1, f2-ref vars
		f1 = null;
		f2 = null;
		//null/blank ref objects-eligible for clean up-eligible for garbage colln
		
		//manually calling gc()
		System.gc();

	}

}
