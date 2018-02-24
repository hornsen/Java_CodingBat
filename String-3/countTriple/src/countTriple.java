class CodingBat{
  public static void main(String[] args){
	  /*
	We'll say that a "triple" in a string is a char appearing three times in a row. 
	Return the number of triples in the given string. The triples may overlap.
	   */
	  
	  System.out.println(countTriple("abcXXXabc"));
	  System.out.println(countTriple("xxxabyyyycd"));
	  System.out.println(countTriple("a")); 	
	  System.out.println(countTriple("")); 
	  System.out.println(countTriple("XXXabc"));
	  System.out.println(countTriple("XXXXabc")); 
	  System.out.println(countTriple("XXXXXabc")); 	
	  System.out.println(countTriple("222abyyycdXXX")); 	
	  System.out.println(countTriple("abYYYabXXXXXab")); 	
	  System.out.println(countTriple("abYYXabXXYXXab")); 	
	  System.out.println(countTriple("abYYXabXXYXXab")); 	
	  System.out.println(countTriple("122abhhh2"));
	  
  }


  public static int countTriple(String str) {
	  if(str.length()<3){
	    return 0;
	  }
	  
	  int counter=0;
	  
	  for(int i=0; i<str.length()-2; i++){
	    if( str.charAt(i)==( str.charAt(i+1) )  && str.charAt(i)==( str.charAt(i+2) ) ){
	      counter+=1;
	    }
	  }
	  
	  return counter;
	}



}