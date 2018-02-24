import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of non-empty strings, create and return a Map<String, String> as follows: 
		 for each string add its first character as a key with its last character as the value.
		 */
		
		System.out.println(pairs(new String[]{"code", "bug"}));	
		System.out.println(pairs(new String[]{"man", "moon", "main"}));	
		System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));	
		System.out.println(pairs(new String[]{})); 	
		System.out.println(pairs(new String[]{"a", "b"}));	
		System.out.println(pairs(new String[]{"are", "codes", "and", "cods"})); 	
		System.out.println(pairs(new String[]{"apple", "banana", "tea", "coffee"})); 
	}
	
	public static Map<String, String> pairs(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  for(String s : strings){
		    map.put(s.substring(0,1), s.substring(s.length()-1,s.length()));
		  }
		  return map;
		}
	
}