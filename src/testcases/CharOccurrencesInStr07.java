package testcases;

public class CharOccurrencesInStr07 {

	public static void main(String[] args) {
		// String- collection of chars enclosed in double quotes
		//in string space also has an index value
		//to know the index of a particular char-2methods
		//str.indexOf('char')
		//str.indexOf('char', fromindexnumber)
		//---is an overloaded method
		
		String str = "The rains have started here, so sowing seeds";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));//8-firstindexofs
		//also called first occurrence of s
		
		System.out.println(str.indexOf('s', 9));//15
		//for duplicate s chars creating a formulae
		
		//can be written as
		System.out.println(str.indexOf('s',8+1));//15-second occurrence of s
		//replace 8 with str.indexOf('s')
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//15
		
		//3rd occurrence of s:need to pass entire line above in str.indexOf('s',29)
		//29=15+14=(str.indexOf('s',str.indexOf('s')+1)+1)
		System.out.println(str.indexOf('s', str.indexOf('s',str.indexOf('s')+1)+1));
		
		//4rth occurrence:32= 29+3
		System.out.println(str.indexOf('s',str.indexOf('s', str.indexOf('s',str.indexOf('s')+1)+1)+1));//32
		
		//now the general formula for nth occurrence of a char:
		
		
	}

}
