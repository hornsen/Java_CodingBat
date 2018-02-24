class Codingbat{
	public static void main(String[] args){
		/*
		 Given an array of scores, return true if each score is equal or 
		 greater than the one before. The array will be length 2 or more.
		 */
		
		System.out.println(scoresIncreasing(new int[]{1, 3, 4})); 
		System.out.println(scoresIncreasing(new int[]{1, 3, 2})); 
		System.out.println(scoresIncreasing(new int[]{1, 1, 4})); 
		System.out.println(scoresIncreasing(new int[]{1, 1, 2, 4, 4, 7})); 
		System.out.println(scoresIncreasing(new int[]{1, 1, 2, 4, 3, 7})); 
		System.out.println(scoresIncreasing(new int[]{-5, 4, 11})); 
	}
	
	public static boolean scoresIncreasing(int[] scores) {
		  for(int i=0; i<scores.length-1; i++){
		    if(scores[i] > scores[i+1]){
		      return false;
		    }
		    
		  }
		  return true;
		}

}