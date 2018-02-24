class Codingbat{
	public static void main(String[] args){
		/*
		 Given a string, return true if the number of appearances of "is"
		 anywhere in the string is equal to the number of appearances of 
		 "not" anywhere in the string (case sensitive).
		 */
		System.out.println(equalIsNot("This is not")); 
		System.out.println(equalIsNot("This is notnot"));	
		System.out.println(equalIsNot("noisxxnotyynotxisi")); 
		System.out.println(equalIsNot("noisxxnotyynotxsi"));
		System.out.println(equalIsNot("xxxyyyzzzintint")); 	
		System.out.println(equalIsNot("")); 
		System.out.println(equalIsNot("isisnotnot")); 
		System.out.println(equalIsNot("isisnotno7Not")); 
		System.out.println(equalIsNot("isnotis")); 
		System.out.println(equalIsNot("mis3notpotbotis"));
		
	}
	public static boolean equalIsNot(String str) {
		  int counterNot =0;
		  int counterIs = 0;
		  
		  for(int i=0; i<str.length(); i++){
		    
		    if(str.length() >= i+3){
		      if( str.substring(i, i+3).equals("not") ){
		        counterNot+=1;
		      } 
		    }

		    if(str.length() >= i+2){
		      if( str.substring(i, i+2).equals("is") ){
		        counterIs+=1;
		      } 
		    }
		    
		  }
		  if(counterNot == counterIs){
		    return true;
		  } else { return false; }
		}

}