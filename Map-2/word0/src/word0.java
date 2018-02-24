import java.util.HashMap;
import java.util.Map;


class Codingbat{
	public static void main(String[] args){
		/*
		Given an array of strings, return a Map<String, Integer> 
		containing a key for every different string in the array, always with the value 0. 
		For example the string "hello" makes the pair "hello":0. 
		We'll do more complicated counting later, but for this problem the value is simply 0.
		 */
		
		System.out.println(word0(new String[]{"a", "b", "a", "b"}));
		System.out.println(word0(new String[]{"a", "b", "a", "c", "b"}));		
		System.out.println(word0(new String[]{"c", "b", "a"}));
		System.out.println(word0(new String[]{"c", "c", "c", "c"})); 
		System.out.println(word0(new String[]{}));
		
	}
	
	public static Map<String, Integer> word0(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for (String string : strings){
		      map.put(string, 0);
		    }
		  return map;
		}

}