class Codingbat{
	
	public static void main(String[] args){
		/*
		 Given a string, compute recursively the number of 
		 times lowercase "hi" appears in the string, 
		 however do not count "hi" that have an 'x' immedately before them.
		 */
		
		System.out.println(countHi2("ahixhi")); 
		System.out.println(countHi2("ahibhi"));	
		System.out.println(countHi2("xhixhi")); 
		System.out.println(countHi2("hixhi")); 	
		System.out.println(countHi2("hixhhi"));	
		System.out.println(countHi2("hihihi")); 	
		System.out.println(countHi2("hihihix")); 
		System.out.println(countHi2("xhihihix")); 	
		System.out.println(countHi2("xxhi")); 
		System.out.println(countHi2("hixxhi")); 
		System.out.println(countHi2("hi")); 	
		System.out.println(countHi2("xxxx")); 
		System.out.println(countHi2("h")); 
		System.out.println(countHi2("x"));
		System.out.println(countHi2("")); 
		System.out.println(countHi2("Hellohi"));
		
	}
	
	public static int countHi2(String str) {
		  if(str.length() <2){
		    return 0;
		  } 
		  
		  if(str.length() >= 3){
		      if(str.substring(0,1).equals("x") && str.substring(1,3).equals("hi")){
		        return countHi2(str.substring(3,str.length()));
		      } else if(str.substring(0,2).equals("hi")){
		        return 1 + countHi2(str.substring(2,str.length()));
		    } else { return countHi2(str.substring(1,str.length())); }
		  } else if(str.length() <= 2 && str.substring(0,2).equals("hi")){
		    return 1;
		  } else { return 0;}
		  
		  
		}

	
	
}