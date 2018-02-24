import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 We'll say that 2 strings "match" if they are non-empty and their 
		 first chars are the same. Loop over and then return the given 
		 array of non-empty strings as follows: if a string matches an 
		 earlier string in the array, swap the 2 strings in the array. 
		 A particular first char can only cause 1 swap, so once a char 
		 has caused a swap, its later swaps are disabled. Using a map, 
		 this can be solved making just one pass over the array. 
		 More difficult than it looks.
		 */
		
		System.out.println(firstSwap(new String[]{"ab", "ac"}));
		System.out.println(firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"})); 
		System.out.println(firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));
		System.out.println(firstSwap(new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"})); 
		System.out.println(firstSwap(new String[]{"easy", "does", "it", "every", "ice", "eaten"})); 
		System.out.println(firstSwap(new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"}));
		System.out.println(firstSwap(new String[]{"4", "8", "15", "16", "23", "42"})); 
		System.out.println(firstSwap(new String[]{"aaa"})); 
		System.out.println(firstSwap(new String[]{})); 
		System.out.println(firstSwap(new String[]{"a", "b", "c", "xx", "yy", "zz"})); 
		
	}
	
	public static String firstSwap(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  Map<String, Integer> map2 = new HashMap<String, Integer>();
		  Map<String, Boolean> disable = new HashMap<String, Boolean>();
		  String [] result = new String [strings.length];
		  
		  for(int i = 0; i < strings.length; i++){
		    String key = strings[i].substring(0,1);
		    String value = strings[i].substring( 1,strings[i].length() );
		    
		    if(map.containsKey(key) == true ){
		      if(disable.containsKey(key) == false){
		        result[ map2.get( key ) ] = key+value;
		        result[ i ] = map.get( key );
		        map.remove(key);
		        map2.remove(key);
		        disable.put(key, true);
		      } else{ result[ i ] = key+value; }

		      
		    } else{ 
		      map.put( key, key+value); 
		      map2.put( key, i ); 
		      result[ i ] = key+value;
		    }
		  }
		  return Arrays.toString(result);  
		}


	
}