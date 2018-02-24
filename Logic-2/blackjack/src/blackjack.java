class Codingbat{
	public static void main(String[] args){
		/*
		 Given 2 int values greater than 0, return whichever value 
		 is nearest to 21 without going over. Return 0 if they both go over.
		 */
		System.out.println(blackjack(19, 21)); 
		System.out.println(blackjack(21, 19)); 
		System.out.println(blackjack(19, 22));
		System.out.println(blackjack(22, 19));	
		System.out.println(blackjack(22, 50));
		System.out.println(blackjack(22, 22));
		System.out.println(blackjack(33, 1)); 	
		System.out.println(blackjack(1, 2)); 
		System.out.println(blackjack(34, 33));
		System.out.println(blackjack(17, 19)); 	
		System.out.println(blackjack(18, 17)); 
		System.out.println(blackjack(16, 23)); 	
		System.out.println(blackjack(3, 4)); 
		System.out.println(blackjack(3, 2)); 
		System.out.println(blackjack(21, 20));
	}
	
	public static int blackjack(int a, int b) {
		  
		  if((a>b || b>21) && a<=21){
		    return a;
		  } else{ if(b<=21){
		    return b;
		    
		  }else {return 0;}
		  }

		}

}