class Codingbat{
	public static void main(String[] args){
		/*
		 We have a number of bunnies and each bunny has 
		 two big floppy ears. We want to compute the total 
		 number of ears across all the bunnies recursively 
		 (without loops or multiplication).
		 */
		
		System.out.println(bunnyEars(0));
		System.out.println(bunnyEars(1));	
		System.out.println(bunnyEars(2));
		System.out.println(bunnyEars(3)); 
		System.out.println(bunnyEars(4)); 
		System.out.println(bunnyEars(5)); 	
		System.out.println(bunnyEars(12)); 
		System.out.println(bunnyEars(50)); 
		System.out.println(bunnyEars(234));
	}
	
	public static int bunnyEars(int bunnies) {
		  if(bunnies == 0){ return 0;}
		  else if(bunnies == 1){ return 2;}
		  
		  return bunnyEars(bunnies-1)+2;
		}

}