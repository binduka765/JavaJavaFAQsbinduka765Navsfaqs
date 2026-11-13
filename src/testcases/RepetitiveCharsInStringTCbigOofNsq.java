package testcases;

public class RepetitiveCharsInStringTCbigOofNsq {
	
	    public static void main(String[] args) {
	        String text = "canada";

	        for (int i = 0; i < text.length(); i++) {
	            boolean alreadyReported = false;

	            // Don't report a character if it appeared earlier
	            for (int k = 0; k < i; k++) {
	                if (text.charAt(i) == text.charAt(k)) {
	                    alreadyReported = true;
	                    break;
	                }
	            }

	            if (alreadyReported) {
	                continue;
	            }

	            int count = 0;
	            for (int j = 0; j < text.length(); j++) {
	                if (text.charAt(i) == text.charAt(j)) {
	                    count++;
	                }
	            }

	            if (count > 1) {
	                System.out.println(text.charAt(i) + " appears " + count + " times");
	            }
	        }
	    }
	}


