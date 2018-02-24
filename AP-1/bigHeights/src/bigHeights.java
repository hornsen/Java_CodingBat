class Codingbat{
	public static void main(String[] args){
		/*
		 (A variation on the sumHeights problem.) 
		 We have an array of heights, representing the altitude along a walking trail. 
		 Given start/end indexes into the array, return the number of "big" steps 
		 for a walk starting at the start index and ending at the end index. 
		 We'll say that step is big if it is 5 or more up or down. 
		 The start end end index will both be valid indexes into the array with start <= end.
		 */
		
		System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 2, 4));	
		System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 1)); 	
		System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 0, 4)); 
		System.out.println(bigHeights(new int[]{5, 3, 6, 7, 3}, 0, 4)); 
		System.out.println(bigHeights(new int[]{5, 3, 6, 7, 2}, 1, 1)); 	
		System.out.println(bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 2)); 
		System.out.println(bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 2)); 	
		System.out.println(bigHeights(new int[]{5, 13, 6, 7, 2}, 1, 4)); 
		System.out.println(bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 4)); 	
		System.out.println(bigHeights(new int[]{5, 13, 6, 7, 2}, 0, 3)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8)); 
		System.out.println(bigHeights(new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8));
	}
	
	public static int bigHeights(int[] heights, int start, int end) {
		  int count=0;
		  
		  for(int i=start; i<end; i++){
		    if(Math.abs( heights[i+1] - heights[i]  ) >= 5){
		      count += 1;
		    }
		  }
		  return count;
		}

	
	
}