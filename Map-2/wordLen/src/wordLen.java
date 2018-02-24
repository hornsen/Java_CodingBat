import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of strings, return a Map<String, Integer> containing a key 
		 for every different string in the array, and the value is that string's length.
		 */
		
		System.out.println(wordLen(new String[]{"a", "bb", "a", "bb"}));
		System.out.println(wordLen(new String[]{"this", "and", "that", "and"})); 
		System.out.println(wordLen(new String[]{"code", "code", "code", "bug"})); 
		System.out.println(wordLen(new String[]{"z"}));
	}
	
	public static Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for (String s : strings){
		    map.put(s, s.length());
		  }
		  return map;

		}

}