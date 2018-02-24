class CodingBat{
  public static void main(String[] args){
	  /*
	   Given a string, return the longest substring that appears at 
	   both the beginning and end of the string without overlapping. 
	   For example, sameEnds("abXab") is "ab".
	   */
	  
	  System.out.println(sameEnds("abXYab"));
	  System.out.println(sameEnds("xx"));
	  System.out.println(sameEnds("xxx"));
	  System.out.println(sameEnds("xxxx")); 
	  System.out.println(sameEnds("javaXYZjava"));
	  System.out.println(sameEnds("javajava")); 	
	  System.out.println(sameEnds("xavaXYZjava"));	
	  System.out.println(sameEnds("Hello! and Hello!")); 
	  System.out.println(sameEnds("x"));	
	  System.out.println(sameEnds(""));
	  System.out.println(sameEnds("abcb"));
	  System.out.println(sameEnds("mymmy")); 
	  
  }

  public static String sameEnds(String string) {
	  String result="";
	  
	  for(int i =0; i<string.length(); i++){
	    if(string.substring(0,i).equals( string.substring(string.length()-i, string.length() ) )){
	      if((i *2) <= string.length()){
	        result=string.substring(0,i);
	      }
	    }
	  }
	  
	  return result;
	  
	}

}