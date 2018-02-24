class Codingbat{
	
	public static void main(String[] args){
		
		/*
		 Given a non-negative int n, return the count of the occurrences 
		 of 7 as a digit, so for example 717 yields 2. (no loops). 
		 Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), 
		 while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
		 */
		
		System.out.println(count7(717)); 
		System.out.println(count7(7));
		System.out.println(count7(123)); 
		System.out.println(count7(77)); 
		System.out.println(count7(7123));
		System.out.println(count7(771237));
		System.out.println(count7(771737)); 
		System.out.println(count7(47571));  
		System.out.println(count7(777777)); 	
		System.out.println(count7(70701277)); 
		System.out.println(count7(777576197)); 
		System.out.println(count7(99999)); 
		System.out.println(count7(99799));
	}
	
	
	public static int count7(int n) {
		  if(n ==0){
		    return 0;
		  } else if(n % 10 == 7){ 
		    return count7(n / 10)+1;
		  } else { return count7(n / 10); }  
		}

	
	
}