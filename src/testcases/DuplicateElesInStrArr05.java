package testcases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElesInStrArr05 {
	// "",
	public static void main(String[] args) {
		System.out.println("---using comparison to adj ele TC O(n^2)---");
		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java" };

		// 1. compare each element:worst soln O(n^2)-since 2 for loops
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("duplicate ele is: " + names[i]);
				}

			}
		}
		System.out.println("---using hash set-TC O(n)---");
		// 2.using hash set: is part of java colln
		// property it stores unique values only
		HashSet<String> store = new HashSet<String>();
		for (String e : names) {
			if (store.add(e) == false) {
				System.out.println("duplicate ele is::: " + e);
			}
		}
		System.out.println("---using hash map TC O(2n)best soln---");
		// 3.using hashmap:put() + entrySet()
		HashMap<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String e:names) {
			Integer count = storeMap.get(e);
			
			if(count == null) {
				storeMap.put(e, 1);
			}
			else {
				storeMap.put(e, ++count);
			}
			
			//get the values from this hashmap:
			
			Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
			for(Entry<String, Integer>en:entrySet) {
				if(en.getValue()>1) {
					System.out.println("duplicate ele is "+en.getKey());
				}
			}
		}
		
		

	}

}
