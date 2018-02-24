import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of strings, return a Map<String, Boolean> 
		 where each different string is a key and its value is true 
		 if that string appears 2 or more times in the array.
		 */
		
		System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));	
		System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
		System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
		System.out.println(wordMultiple(new String[]{})); 
		System.out.println(wordMultiple(new String[]{"this", "and", "this"}));
		System.out.println(wordMultiple(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"}));
		
	}
	
	public static Map<String, Boolean> wordMultiple(String[] strings) {
		  Map<String, Boolean> map = new HashMap<String, Boolean>();
		  
		  for(String s : strings){
		    if(map.containsKey(s)){
		      map.put(s, true);
		    } else { map.put(s, false); }
		  }
		  return map;
		}

	
}