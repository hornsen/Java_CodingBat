class Codingbat{
	public static void main(String[] args){
		/*
		 Start with two arrays of strings, a and b, each in alphabetical order, 
		 possibly with duplicates. Return the count of the number of strings 
		 which appear in both arrays. The best "linear" solution makes a single 
		 pass over both arrays, taking advantage of the fact that they are in alphabetical order.
		 */
		
		System.out.println(commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
		System.out.println(commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
		System.out.println(commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"}));
		System.out.println(commonTwo(new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}));
		System.out.println(commonTwo(new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"}));
		System.out.println(commonTwo(new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}));
		System.out.println(commonTwo(new String[]{"a"}, new String[]{"a", "b"}));
		System.out.println(commonTwo(new String[]{"a"}, new String[]{"b"}));
		System.out.println(commonTwo(new String[]{"a", "a"}, new String[]{"b", "b"}));
		System.out.println(commonTwo(new String[]{"a", "b"}, new String[]{"a", "b"}));
	}
	
	public static int commonTwo(String[] a, String[] b) {
		int count=0;
		String letter = "";
		  
		  for(String letterA : a){
		    for(String letterB : b){
		      if(letterA == letterB && letter != letterA){
		        count+=1;
		        letter = letterA;
		      }
		    }
		  }
		  return count;
		}

}

