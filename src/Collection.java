import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// 3 collection (List, Set, Map)
		
		/*
		 * List
		 * Allows duplicates
		 * Keeps elements ordered by index
		 * Allows null values
		 * Common implementations: ArrayList,LinkList,Vector
		 */
		List<String> students  = new ArrayList<String>();
		students.add("Rob");
		students.add("Sam");
		students.add("Joe");
		
		for(String student: students) {
			System.out.println(student);
		}
		System.out.println(students.get(0));// Rob
		
		/* Set
		 * No duplicates
		 * Unordered
		 * Allow null
		 * Common implementations: HashSet, LinkedHashSet, TreeSet
		 */
		Set<String> states  = new HashSet<String>();
		states.add("Alabama");
		states.add("Arizona");
		states.add("Utah");
		states.add("Colorado");
		// contains method
		
		
		for(String state : states) {
			System.out.println(state);
		}
		System.out.println(states.size());
		System.out.println(states.contains("Alabama"));
		// remove method
		if(states.contains("Alabama")) {
			states.remove("Alabama");
			
		}
		
		
		/* Map same as Dictionary
		 * Map<K,V> K is Key, and V is the Value
		 * Key: value pair(dictionary) first-word(key) and second-word(value)
		 * Value can be duplicate but no keys
		 * Common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		// put method to add element
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		racerPlacements.put(4, "Wade");
		//remove 
		//racerPlacements.remove(1);
		// keySet method to get the key
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key: racerKeys) {
			System.out.println(key);	
		}
		//values method to get the method
		Collections<String> racers = racerPlacements.values();
		for (String racer: racers) {
			System.out.println(racer);
		}
		
		
		
		System.out.println(racerPlacements.get(2));
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("study","a detailed investigation and analysis of a subject or situation");
		dictionary.put("algorithm", "set of rules to be followed in problem-solving operations, especially by a computer.");
		dictionary.put("database","set of data held in a computer, especially one that is accessible in various ways.");

	}

}
