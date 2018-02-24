import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of non-empty strings, return a Map<String, String> 
		 with a key for every different first character seen, with the value 
		 of all the strings starting with that character appended together 
		 in the order they appear in the array.
		 */
		
		System.out.println(firstChar(new String[]{"salt", "tea", "soda", "toast"}));	
		System.out.println(firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"})); 
		System.out.println(firstChar(new String[]{})); 
		System.out.println(firstChar(new String[]{"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"}));
	}
	
	public static Map<String, String> firstChar(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  for(String s : strings){
		    String letter = s.substring(0,1);
		    if(map.containsKey(letter)){
		      map.put(letter, map.get(letter) + s);  
		    } else { map.put(letter, s); }
		    
		  }
		  return map;
		}

}