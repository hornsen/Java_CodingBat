class Codingbat{
	public static void main(String[] args){
		/*
		 We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately 
		 to its left or right. Return true if all the g's in the given string are happy.
		 */
		
		System.out.println(gHappy("xxggxx")); 
		System.out.println(gHappy("xxgxx"));
		System.out.println(gHappy("xxggyygxx"));
		System.out.println(gHappy("g")); 	
		System.out.println(gHappy("gg")); 	
		System.out.println(gHappy("")); 	
		System.out.println(gHappy("xxgggxyz")); 
		System.out.println(gHappy("xxgggxyg")); 
		System.out.println(gHappy("xxgggxygg"));
		System.out.println(gHappy("mgm")); 
		System.out.println(gHappy("mggm")); 
		System.out.println(gHappy("yyygggxyy")); 
	}
	
	public static boolean gHappy(String str) {
		  boolean happy = true;
		  
		  if(str.length() ==1 && str.charAt(0)==('g')){
		    return false;
		  }
		  
		  for(int i =0; i<str.length(); i++){
		    if(i< str.length() && i>0){
		        if( str.charAt(i)==('g') ){
		          if( (str.charAt(i-1)==('g') && i>0)|| (i<str.length()-1 && str.charAt(i+1)==('g')) ){
		            happy=true;
		          } else { happy=false; } 
		        } 
		    } 
		  } return happy;
		}

}