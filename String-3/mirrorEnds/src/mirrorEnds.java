class CodingBat{
  public static void main(String[] args){
	  /*
	   Given a string, look for a mirror image (backwards) string at both 
	   the beginning and end of the given string. In other words, zero or 
	   more characters at the very beginning of the given string, and at the 
	   very end of the string in reverse order (possibly overlapping). 
	   For example, the string "abXYZba" has the mirror end "ab".
	   */
	  
	  System.out.println(mirrorEnds("abXYZba"));
	  System.out.println(mirrorEnds("abca"));	
	  System.out.println(mirrorEnds("aba"));	
	  System.out.println(mirrorEnds("abab"));	
	  System.out.println(mirrorEnds("xxx"));	
	  System.out.println(mirrorEnds("xxYxx"));	
	  System.out.println(mirrorEnds("Hi and iH"));	
	  System.out.println(mirrorEnds("x"));	
	  System.out.println(mirrorEnds(""));
	  System.out.println(mirrorEnds("123and then 321"));
	  System.out.println(mirrorEnds("band andab"));
	  
  }

  public static String mirrorEnds(String string) {
	  String result="";
	  if(string.length() ==0){
	    return result;
	  }
	  
	  for(int i=0;i<string.length();i++){
	    if(string.charAt(i) == string.charAt(string.length()-1-i)){
	      result+=string.charAt(i);
	    } else{  break; }
	  }
	 return result;
	}

}