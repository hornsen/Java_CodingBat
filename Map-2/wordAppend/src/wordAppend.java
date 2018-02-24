import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 Loop over the given array of strings to build a 
		 result string like this: when a string appears 
		 the 2nd, 4th, 6th, etc. time in the array, 
		 append the string to the result. 
		 Return the empty string if no string appears a 2nd time.
		 */
		
		System.out.println(wordAppend(new String[]{"a", "b", "a"})); 
		System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"})); 
		System.out.println(wordAppend(new String[]{"a", "", "a"})); 
		System.out.println(wordAppend(new String[]{})); 	
		System.out.println(wordAppend(new String[]{"a", "b", "b", "a", "a"})); 
		System.out.println(wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a"})); 
		System.out.println(wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}));
		System.out.println(wordAppend(new String[]{"not", "and", "or", "and", "this", "and", "or", "that", "not"})); 
		System.out.println(wordAppend(new String[]{"a", "b", "c"}));
		System.out.println(wordAppend(new String[]{"this", "or", "that", "and", "this", "and", "that"})); 
		System.out.println(wordAppend(new String[]{"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}));
	}
	
	public static String wordAppend(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  String result = "";
		  
		  for(String s : strings){
		    if(map.containsKey(s)){
		      result += s;
		      map.remove(s);
		      } else { map.put(s, s);}
		  }
		  return result;
		}

	
	
}

