class CodingBat{
  public static void main(String[] args){
	  /*
	   Given a string, return the length of the largest "block" in the string. 
	   A block is a run of adjacent chars that are the same.
	   */
	  
	  System.out.println(maxBlock("hoopla"));
	  System.out.println(maxBlock("abbCCCddBBBxx"));
	  System.out.println(maxBlock(""));
	  System.out.println(maxBlock("xyz"));	
	  System.out.println(maxBlock("xxyz"));
	  System.out.println(maxBlock("xyzz"));	
	  System.out.println(maxBlock("abbbcbbbxbbbx"));	
	  System.out.println(maxBlock("XXBBBbbxx"));	
	  System.out.println(maxBlock("XXBBBBbbxx"));	
	  System.out.println(maxBlock("XXBBBbbxxXXXX"));	
	  System.out.println(maxBlock("XX2222BBBbbXX2222"));
	  
  }

public static int maxBlock(String str) {
  int counter=0;

  for(int i=0; i<str.length(); i++){
    int counter_tmp=0;
    
    for(int j=i; j<str.length(); j++){
       if(str.charAt(i) == str.charAt(j) ){
         counter_tmp+=1;
       } else{ break; }

    } if (counter_tmp > counter) { counter = counter_tmp; }
  

  }return counter;
}
}