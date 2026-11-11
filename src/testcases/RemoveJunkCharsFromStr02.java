package testcases;

public class RemoveJunkCharsFromStr02 {

	public static void main(String[] args) {
		//need to use REGULAR EXPRESSION-to be written
		//inside square brackets-[^a-zA-Z0-9]
		//use replaceAll()
		//since s is immutable - applying replaceAll on s itself
		
		String s = "!@#$%12345)testing(*&^98765";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
