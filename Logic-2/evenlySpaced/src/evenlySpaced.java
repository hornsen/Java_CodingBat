import java.util.Arrays;

class Codingbat{
	public static void main(String[] args){
		/*
		 Given three ints, a b c, one of them is small, one is medium and one is large. 
		 Return true if the three values are evenly spaced, so the difference between 
		 small and medium is the same as the difference between medium and large.
		 */
		System.out.println(evenlySpaced(2, 4, 6));
		System.out.println(evenlySpaced(4, 6, 2)); 
		System.out.println(evenlySpaced(4, 6, 3));	
		System.out.println(evenlySpaced(6, 2, 4));	
		System.out.println(evenlySpaced(6, 2, 8));
		System.out.println(evenlySpaced(2, 2, 2)); 
		System.out.println(evenlySpaced(2, 2, 3)); 
		System.out.println(evenlySpaced(9, 10, 11)); 
		System.out.println(evenlySpaced(10, 9, 11)); 	
		System.out.println(evenlySpaced(10, 9, 9)); 
		System.out.println(evenlySpaced(2, 4, 4));
		System.out.println(evenlySpaced(2, 2, 4)); 
		System.out.println(evenlySpaced(3, 6, 12)); 
		System.out.println(evenlySpaced(12, 3, 6));
	}
	
	public static boolean evenlySpaced(int a, int b, int c) {
		  int[] ints = {a, b, c};
		  Arrays.sort(ints);
		  
		  if(ints[1] - ints[0] == ints[2] - ints[1]){
		    return true;
		  }
		  return false;
		}
}