package testcases;

public class StringManipulations07b {

	public static void main(String[] args) {
		//str.indexOf('s')and str.indexOf("str")
		//index could be for char + string as well
		//if index is not there - returns -1-so helpful to test
		//if particular word/char is available on UI
		//string comparison:case sensitive when
		//.equals() -is used-make sure strs exact same
		
		//in String class: reverse() - not available since immutable
		//--need to convert to SB and then reverse it
		
		//String: can be concatenated with any data type: double, int, char, float
		
		
		//string comparison
		String str = "The rains have started here";
		String str1 = "the rains have started here";
		
		
		System.out.println(str.indexOf('r'));//4
		System.out.println(str.indexOf("have"));//10
		System.out.println(str.indexOf("hello"));//-1
		System.out.println(str.equals(str1));//false since .equals() is case sensitive
		
		System.out.println(str.equalsIgnoreCase(str1));//true
		
		//substring:str.substring(beginIndex, endIndex):
		System.out.println(str.substring(0, 8));//The rain
		
		//trim:trims only before space, after space: NOT in between spaces
		String s = "   Hello  World  ";
		System.out.println(s.trim());//Hello  World
		
		//replace("old char","new char") - to remove between spaces
		System.out.println(s.replace(" ", ""));//HelloWorld
		
		String date = "01-01-2017";
		System.out.println(date.replace("-", "/"));//01/01/2017
		
		//split():
		String test = "Hello_World_Test_Selenium";
		//System.out.println(test.split("_"));//[Ljava.lang.String;@6f539caf-weird output
	
		String testVal[] = test.split("_");
		System.out.println("---for each loop---");
		for(String e:testVal) {
			System.out.println(e);
		}
		System.out.println("--indexBasedForLoop--");
		for(int i=0;i<testVal.length;i++) {
			System.out.println(testVal[i]);
		}
		
		String s2 = "cares";
		System.out.println(s2.concat("s"));//caress
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);//HelloWorld
		System.out.println(a+b);//300
		System.out.println(x+y+a+b);//HelloWorld100200
		System.out.println(a+b+x+y);//300HelloWorld
		System.out.println(x+y+(a+b));//HelloWorld300
		
	}

}
