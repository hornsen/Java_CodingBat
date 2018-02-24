class Codingbat{
	
	public static void main(String[] args){
		/*
		 Given a string and a non-empty substring sub, 
		 compute recursively the largest substring which 
		 starts and ends with sub and return its length.
		 */
		
		System.out.println(strDist("catcowcat", "cat")); 
		System.out.println(strDist("catcowcat", "cow"));
		System.out.println(strDist("cccatcowcatxx", "cat"));
		System.out.println(strDist("abccatcowcatcatxyz", "cat")); 
		System.out.println(strDist("xyx", "x")); 	
		System.out.println(strDist("xyx", "y"));	
		System.out.println(strDist("xyx", "z")); 	
		System.out.println(strDist("z", "z")); 	
		System.out.println(strDist("x", "z")); 
		System.out.println(strDist("", "z")); 	
		System.out.println(strDist("hiHellohihihi", "hi")); 	
		System.out.println(strDist("hiHellohihihi", "hih"));	
		System.out.println(strDist("hiHellohihihi", "o")); 
		System.out.println(strDist("hiHellohihihi", "ll"));
	}
	
	public static int strDist(String str, String sub) {
		  if(str.length() <= sub.length() ){
		    if(str.equals(sub)){
		      return str.length();
		    } else{ return 0; }
		    
		  } else if(str.substring(0,sub.length()).equals(sub)){
		    if(str.substring(str.length()-sub.length(), str.length()).equals(sub)){
		      return str.length();
		    } else{ return strDist(str.substring(0,str.length()-1), sub); } 
		    
		  } else { return strDist(str.substring(1,str.length()), sub); }
		  
		}
}