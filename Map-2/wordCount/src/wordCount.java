import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 The classic word-count algorithm: given an array of strings, 
		 return a Map<String, Integer> with a key for each different string, 
		 with the value the number of times that string appears in the array.
		 */
		
		System.out.println(wordCount(new String[]{"a", "b", "a", "c", "b"})); 	
		System.out.println(wordCount(new String[]{"c", "b", "a"})); 
		System.out.println(wordCount(new String[]{"c", "c", "c", "c"})); 
		System.out.println(wordCount(new String[]{}));
		System.out.println(wordCount(new String[]{"this", "and", "this", ""})); 
		System.out.println(wordCount(new String[]{"x", "y", "x", "Y", "X"}));
		System.out.println(wordCount(new String[]{"123", "0", "123", "1"}));
		System.out.println(wordCount(new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two"})); 
		System.out.println(wordCount(new String[]{"apple", "banana", "apple", "apple", "tea", "coffee", "banana"}));
	}
	
	public static Map<String, Integer> wordCount(String[] strings) {
		  Map <String, Integer> map = new HashMap<String, Integer>();
		  for(String s : strings){
		    if(map.containsKey(s)){
		      map.put(s, map.get(s)+1);
		   } else{ map.put(s,1);}
		  }
		  return map;
		}

}