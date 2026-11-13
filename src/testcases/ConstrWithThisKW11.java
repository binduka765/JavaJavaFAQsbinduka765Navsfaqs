package testcases;

public class ConstrWithThisKW11 {
	//class vars:
	String name;
	int age;
	//two param constr...
	public ConstrWithThisKW11(String name1, int age1) {
		System.out.println(name1);
		System.out.println(age1);
		//to initialize the local vars of this constr...with class/global vars-use this kw
		name = name1;
		age = age1;
	}

	public static void main(String[] args) {
		ConstrWithThisKW11 obj = new ConstrWithThisKW11("Tom", 33);//outputs Tom 33

	}

}
