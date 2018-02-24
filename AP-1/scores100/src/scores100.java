class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of scores, return true if there are scores of 100 next to 
		 each other in the array. The array length will be at least 2.
		 */
		
		System.out.println(scores100(new int[]{1, 100, 100})); 
		System.out.println(scores100(new int[]{1, 100, 99, 100})); 
		System.out.println(scores100(new int[]{100, 1, 100, 100})); 
		System.out.println(scores100(new int[]{100, 1, 100, 1}));
		System.out.println(scores100(new int[]{1, 2, 3, 4, 5})); 
		System.out.println(scores100(new int[]{1, 2, 100, 4, 5}));
	}
	
	public static boolean scores100(int[] scores) {
		  boolean bool = false;
		  for(int i=0; i<scores.length-1; i++){
		    if(scores[i] == 100 && scores[i+1] == 100){
		      bool = true;
		    }
		  }
		  return bool;
		}

}