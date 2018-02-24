class Codingbat{
	
	public static void main(String[] args){
		/*
		 Given a non-negative int n, return the sum of its digits recursively (no loops).
		 Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
		 while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
		 */
		
		System.out.println(sumDigits(126)); 	
		System.out.println(sumDigits(49)); 
		System.out.println(sumDigits(12));	
		System.out.println(sumDigits(10)); 
		System.out.println(sumDigits(1)); 
		System.out.println(sumDigits(0)); 	
		System.out.println(sumDigits(730));
		System.out.println(sumDigits(1111)); 
		System.out.println(sumDigits(11111));	
		System.out.println(sumDigits(10110)); 	
		System.out.println(sumDigits(235));
	}
	
	public static int sumDigits(int n) {
		  if(n==0){
		    return 0;
		  } else { return n % 10 + sumDigits(n /10);}
		}

	
}