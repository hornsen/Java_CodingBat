class Codingbat{
	public static void main(String[] args){
		/*
		 Given n of 1 or more, return the factorial of n, 
		 which is n * (n-1) * (n-2) ... 1. 
		 Compute the result recursively (without loops).
		 */
		
		System.out.println(factorial(1));
		System.out.println(factorial(2));	
		System.out.println(factorial(3)); 	
		System.out.println(factorial(4)); 
		System.out.println(factorial(5));	
		System.out.println(factorial(6)); 	
		System.out.println(factorial(7)); 	
		System.out.println(factorial(8)); 	
		System.out.println(factorial(12));
	}
	
	public static int factorial(int n) {
		  if(n == 1){ return 1;}
		  
		  return n * factorial(n-1);
		}

	
	
}