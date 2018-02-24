class Codingbat{
	public static void main(String[] args){
		/*
		 We want make a package of goal kilos of chocolate. 
		 We have small bars (1 kilo each) and big bars (5 kilos each). 
		 Return the number of small bars to use, assuming we always 
		 use big bars before small bars. Return -1 if it can't be done.
		 */
		System.out.println(makeChocolate(4, 1, 9)); 
		System.out.println(makeChocolate(4, 1, 10)); 
		System.out.println(makeChocolate(4, 1, 7)); 
		System.out.println(makeChocolate(6, 2, 7)); 	
		System.out.println(makeChocolate(4, 1, 5)); 
		System.out.println(makeChocolate(4, 1, 4)); 
		System.out.println(makeChocolate(5, 4, 9));
		System.out.println(makeChocolate(9, 3, 18)); 
		System.out.println(makeChocolate(3, 1, 9)); 
		System.out.println(makeChocolate(1, 2, 7)); 	
		System.out.println(makeChocolate(1, 2, 6));
		System.out.println(makeChocolate(1, 2, 5));
		System.out.println(makeChocolate(6, 1, 10)); 
		System.out.println(makeChocolate(6, 1, 11)); 
		System.out.println(makeChocolate(6, 1, 12)); 
		System.out.println(makeChocolate(6, 1, 13));
		System.out.println(makeChocolate(6, 2, 10)); 	
		System.out.println(makeChocolate(6, 2, 11)); 	
		System.out.println(makeChocolate(6, 2, 12)); 	
		System.out.println(makeChocolate(60, 100, 550));
		System.out.println(makeChocolate(1000, 1000000, 5000006));
		System.out.println(makeChocolate(7, 1, 12)); 
		System.out.println(makeChocolate(7, 1, 13)); 
		System.out.println(makeChocolate(7, 2, 13)); 
	}
	public static int makeChocolate(int small, int big, int goal) {
		  
		  
		  if(big*5 == goal){
		    return 0;
		  }
		  
		  if(big*5 <= goal){
		    if(big*5 + small >= goal){
		      return goal - big*5;
		    } 
		  }
		  
		  if(big*5 > goal){
		    for(int i =0; i<big; i++){
		      for(int j=0; j<5; j++){
		        if(i*5 + j == goal){
		          if(j > small){
		            return -1;
		          } else{  return j;}
		          
		         
		        }
		      }
		    }
		  }
		  		  
		  return -1;
		}

}