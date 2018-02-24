import java.util.Arrays;

class Codingbat{
	public static void main(String[] args){
		/*
		 Start with two arrays of strings, A and B, each with its elements in alphabetical 
		 order and without duplicates. Return a new array containing the first N elements 
		 from the two arrays. The result array should be in alphabetical order 
		 and without duplicates. A and B will both have a length which is N or more. 
		 The best "linear" solution makes a single pass over A and B, taking advantage 
		 of the fact that they are in alphabetical order, copying elements directly to the new array.
		 */
		
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3));	
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3)); 
		System.out.println(mergeTwo(new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3));
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3)); 
		System.out.println(mergeTwo(new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3)); 
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3)); 
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2)); 
		System.out.println(mergeTwo(new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3)); 
		System.out.println(mergeTwo(new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3));
	}
	
	public static String mergeTwo(String[] a, String[] b, int n) {
		  String [] myArray = new String [n];
		  int countA = 0;
		  int countB = 0;
		  
		  
		  for(int i =0; i <n; i++){
		    if(a[countA].compareTo(b[countB]) == 0){
		      myArray[i] = a[countA];
		      countA += 1;
		      countB += 1;
		      
		    } else if(a[countA].compareTo(b[countB]) < 0){
		        myArray[i] = a[countA];
		        countA += 1;
		    } else { 
		            
		            myArray[i] = b[countB];
		            countB += 1;
		    }  
		  }
		  return Arrays.toString(myArray);
		  
		}

}