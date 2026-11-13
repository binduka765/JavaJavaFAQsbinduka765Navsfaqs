package testcases;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepetitiveCharsInStringIntfailQtcOofN {

	    public static void main(String[] args) {
	        String text = "canada";
	        Map<Character, Integer> counts = new LinkedHashMap<>();

	        for (char ch : text.toCharArray()) {
	            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
	        }

	        System.out.println("Repeated characters in \"" + text + "\":");
	        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
	            }
	        }
	    }
	
}
