class Codingbat{
	public static void main(String[] args){
		/*
		 We have bunnies standing in a line, numbered 1, 2, ... 
		 The odd bunnies (1, 3, ..) have the normal 2 ears. 
		 The even bunnies (2, 4, ..) we'll say have 3 ears, 
		 because they each have a raised foot. 
		 Recursively return the number of "ears" in the 
		 bunny line 1, 2, ... n (without loops or multiplication).
		 */
		
		System.out.println(bunnyEars2(0));
		System.out.println(bunnyEars2(1)); 
		System.out.println(bunnyEars2(2));
		System.out.println(bunnyEars2(3)); 	
		System.out.println(bunnyEars2(4)); 	
		System.out.println(bunnyEars2(5)); 
		System.out.println(bunnyEars2(6)); 	
		System.out.println(bunnyEars2(10));
		
	}
	
	public static int bunnyEars2(int bunnies) {
		  if(bunnies ==0){
		    return 0;
		  } 
		  
		  if( bunnies % 2 ==0){
		    return bunnyEars2(bunnies -1) + 3;
		  } else if( bunnies % 2 ==1){
		    return bunnyEars2(bunnies -1) + 2;
		  } 
		  
		  return 0;
		}

	
}