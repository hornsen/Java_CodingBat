import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Codingbat{
	public static void main(String[] args){
		/*
		 We'll say that 2 strings "match" if they are non-empty and their first chars are the same. 
		 Loop over and then return the given array of non-empty strings as follows: 
		 if a string matches an earlier string in the array, swap the 2 strings in the array. 
		 When a position in the array has been swapped, it no longer matches anything. 
		 Using a map, this can be solved making just one pass over the array. 
		 More difficult than it looks.
		 */
		
		System.out.println(allSwap(new String[]{"ab", "ac"}));	
		System.out.println(allSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}));	
		System.out.println(allSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}));	
		System.out.println(allSwap(new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"}));	
		System.out.println(allSwap(new String[]{"easy", "does", "it", "every", "ice", "eaten"}));	
		System.out.println(allSwap(new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"})); 
		System.out.println(allSwap(new String[]{"4", "8", "15", "16", "23", "42"})); 
		System.out.println(allSwap(new String[]{"aaa"})); 
		System.out.println(allSwap(new String[]{})); 
		System.out.println(allSwap(new String[]{"a", "b", "c", "xx", "yy", "zz"}));
	}
	
	public static String allSwap(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  Map<String, Integer> map2 = new HashMap<String, Integer>();
		  String [] result = new String [strings.length];
		  
		  for(int i = 0; i < strings.length; i++){
		    String key = strings[i].substring(0,1);
		    String value = strings[i].substring( 1,strings[i].length() );
		    
		    if(map.containsKey(key) == true ){
		      result[ map2.get( key ) ] = key+value;
		      result[ i ] = map.get( key );
		      map.remove(key);
		      map2.remove(key);

		      
		    } else{ 
		      map.put( key, key+value); 
		      map2.put( key, i ); 
		      result[ i ] = key+value;
		    }
		  }
		  return Arrays.toString(result);  
		}

}