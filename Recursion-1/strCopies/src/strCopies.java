class Codingbat{
	
	public static void main(String[] args){
		/* 
		 Given a string and a non-empty substring sub, compute recursively 
		 if at least n copies of sub appear in the string somewhere, 
		 possibly with overlapping. N will be non-negative.
		 */
		
		System.out.println(strCopies("catcowcat", "cat", 2)); 
		System.out.println(strCopies("catcowcat", "cow", 2));
		System.out.println(strCopies("catcowcat", "cow", 1)); 
		System.out.println(strCopies("iiijjj", "i", 3)); 
		System.out.println(strCopies("iiijjj", "i", 4)); 
		System.out.println(strCopies("iiijjj", "ii", 2)); 
		System.out.println(strCopies("iiijjj", "ii", 3)); 
		System.out.println(strCopies("iiijjj", "x", 3)); 
		System.out.println(strCopies("iiijjj", "x", 0)); 
		System.out.println(strCopies("iiiiij", "iii", 3));
		System.out.println(strCopies("iiiiij", "iii", 4));
		System.out.println(strCopies("ijiiiiij", "iiii", 2)); 
		System.out.println(strCopies("ijiiiiij", "iiii", 3)); 
		System.out.println(strCopies("dogcatdogcat", "dog", 2)); 
	}
	
	public static boolean strCopies(String str, String sub, int n) {
		  if(n == 0){
		    return true;
		  } else if(str.length() <= sub.length() && !str.equals(sub) ){
		    return false;
		  } else if(str.substring(0, sub.length()).equals(sub)){
		    return strCopies(str.substring(1, str.length()), sub, n-1);
		  } else{ return strCopies(str.substring(1, str.length()), sub, n); }
		}

}