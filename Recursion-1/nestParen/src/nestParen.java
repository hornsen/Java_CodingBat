class Codingbat{
	
	public static void main(String[] args){
		/*
		 Given a string, return true if it is a nesting of zero 
		 or more pairs of parenthesis, like "(())" or "((()))". 
		 Suggestion: check the first and last chars, 
		 and then recur on what's inside them.
		 */
		
		System.out.println(nestParen("(())")); 
		System.out.println(nestParen("((()))")); 
		System.out.println(nestParen("(((x))")); 
		System.out.println(nestParen("((())")); 
		System.out.println(nestParen("((()()")); 	
		System.out.println(nestParen("()")); 
		System.out.println(nestParen("")); 
		System.out.println(nestParen("(yy)")); 
		System.out.println(nestParen("(())"));
		System.out.println(nestParen("(((y))"));
		System.out.println(nestParen("((y)))")); 
		System.out.println(nestParen("((()))"));
		System.out.println(nestParen("(())))")); 
		System.out.println(nestParen("((yy())))"));
		System.out.println(nestParen("(((())))")); 
		
	}
	
public static boolean nestParen(String str) {
	  if(str.equals("") ) {
	    return true;
	  } else if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
	    return nestParen(str.substring(1, str.length()-1));
	  } else { return false; }
	}

}