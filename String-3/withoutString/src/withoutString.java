class Codingbat{
	public static void main(String[] args){
		/*
		 Given two strings, base and remove, return a version of the base 
		 string where all instances of the remove string have been removed (not case sensitive). 
		 You may assume that the remove string is length 1 or more. 
		 Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
		 */
		System.out.println(withoutString("Hello there", "llo"));
		System.out.println(withoutString("Hello there", "e")); 
		System.out.println(withoutString("Hello there", "x"));
		System.out.println(withoutString("This is a FISH", "IS"));
		System.out.println(withoutString("THIS is a FISH", "is")); 	
		System.out.println(withoutString("THIS is a FISH", "iS"));
		System.out.println(withoutString("abxxxxab", "xx"));
		System.out.println(withoutString("abxxxab", "xx")); 	
		System.out.println(withoutString("abxxxab", "x")); 	
		System.out.println(withoutString("xxx", "x")); 
		System.out.println(withoutString("xxx", "xx")); 
		System.out.println(withoutString("xyzzy", "Y")); 
		System.out.println(withoutString("", "x")); 
		System.out.println(withoutString("abcabc", "b")); 
		System.out.println(withoutString("AA22bb", "2")); 
		System.out.println(withoutString("1111", "1")); 	
		System.out.println(withoutString("1111", "11")); 
		System.out.println(withoutString("MkjtMkx", "Mk")); 
		System.out.println(withoutString("Hi HoHo", "Ho"));
	}
	
	public static String withoutString(String base, String remove) {
		  String result="";
		  
		  if(remove.length() > base.length()){
		    return base;
		  }
		  
		  for(int i=0; i<(base.length()); i++){
		    if( remove.length() + i > base.length() ){
		      return result + base.substring(i, base.length());
		    }
		    
		    
		    if( !base.toLowerCase().substring(i, i+remove.length()).equals(remove.toLowerCase())){
		      result += base.charAt(i);
		    } else{ i+= remove.length()-1; }
		  }
		  
		  
		  return result;
		}

}