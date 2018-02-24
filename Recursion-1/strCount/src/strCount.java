class Codingbat{
	
	public static void main(String[] args){
		
		/*
		 Given a string and a non-empty substring sub, compute recursively 
		 the number of times that sub appears in the string, without the sub strings overlapping.
		 */
		
		System.out.println(strCount("catcowcat", "cat")); 
		System.out.println(strCount("catcowcat", "cow"));
		System.out.println(strCount("catcowcat", "dog")); 
		System.out.println(strCount("cacatcowcat", "cat")); 
		System.out.println(strCount("xyx", "x")); 
		System.out.println(strCount("iiiijj", "i")); 
		System.out.println(strCount("iiiijj", "ii")); 
		System.out.println(strCount("iiiijj", "iii")); 
		System.out.println(strCount("iiiijj", "j"));	
		System.out.println(strCount("iiiijj", "jj"));
		System.out.println(strCount("aaabababab", "ab")); 
		System.out.println(strCount("aaabababab", "aa")); 
		System.out.println(strCount("aaabababab", "a")); 
		System.out.println(strCount("aaabababab", "b"));
	}
	
	public static int strCount(String str, String sub) {
		  if(str.length() < sub.length() ){
		    return 0;
		  } else if(str.substring(0, sub.length()).equals(sub)){
		    return 1 + strCount(str.substring(sub.length(),str.length()), sub); 
		  } else { return strCount(str.substring(1,str.length()), sub); }
		}

	
	
}