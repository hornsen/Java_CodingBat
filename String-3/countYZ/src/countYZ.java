class CodingBat{
  public static void main(String[] args){
	  /*
	Given a string, count the number of words ending in 'y' or 'z' --
	 so the 'y' in "heavy" and the 'z' in "fez" count, 
	 but not the 'y' in "yellow" (not case sensitive). 
	 We'll say that a y or z is at the end of a word if there 
	 is not an alphabetic letter immediately following it. 
	 (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
	   */
	  
	  System.out.println(countYZ("fez day"));
	  System.out.println(countYZ("day fez"));
	  System.out.println(countYZ("day fyyyz")); 	
	  System.out.println(countYZ("day yak")); 
	  System.out.println(countYZ("day:yak"));
	  System.out.println(countYZ("!!day--yaz!!")); 
	  System.out.println(countYZ("yak zak")); 	
	  System.out.println(countYZ("DAY abc XYZ"));
	  System.out.println(countYZ("aaz yyz my"));
	  System.out.println(countYZ("y2bz"));
	  System.out.println(countYZ("zxyx")); 

	  
  }


  public static int countYZ(String str) {
	  int counter =0;
	  
	  for(int i=0; i<str.length(); i++){
	    for(int j=i+1; j<i+2; j++){
	      
	      if(j < str.length()){
	        if( (str.toLowerCase().charAt(i)==('y') || str.toLowerCase().charAt(i)==('z') ) && Character.isLetter(str.charAt(j)) ==false ){
	          counter+=1;
	          }
	      } else{
	          if( str.toLowerCase().charAt(i)==('y') || str.toLowerCase().charAt(i)==('z') ){
	            counter+=1;
	              }
	          }
	        }
	    }
	  return counter;
	}

}