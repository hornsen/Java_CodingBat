class Codingbat{
	
	public static void main(String[] args){
		/*
		 Given a string that contains a single pair of parenthesis, 
		 compute recursively a new string made of only of the 
		 parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
		 */
		
		System.out.println(parenBit("xyz(abc)123")); 
		System.out.println(parenBit("x(hello)"));
		System.out.println(parenBit("(xy)1")); 	
		System.out.println(parenBit("not really (possible)")); 
		System.out.println(parenBit("(abc)"));
		System.out.println(parenBit("(abc)xyz")); 
		System.out.println(parenBit("(abc)x")); 	
		System.out.println(parenBit("(x)"));
		System.out.println(parenBit("()"));
		System.out.println(parenBit("res (ipsa) loquitor")); 
		System.out.println(parenBit("hello(not really)there")); 
		System.out.println(parenBit("ab(ab)ab")); 
		
	}
	
	public static String parenBit(String str) {
		  if(str.substring(0,1).equals("(") && str.substring(str.length()-1,str.length()).equals(")") ){
		    return str.substring(0);
		  } else if(str.substring(0,1).equals("(")){
		    return parenBit(str.substring(0, str.length()-1));
		  } else { return parenBit(str.substring(1)); }
		  
		}

}