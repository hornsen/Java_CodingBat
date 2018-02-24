class Codingbat{
	
	public static void main(String[] args){
		/*
		 We have triangle made of blocks. The topmost row has 1 block, 
		 the next row down has 2 blocks, the next row has 3 blocks, and so on. 
		 Compute recursively (no loops or multiplication) the total 
		 number of blocks in such a triangle with the given number of rows.
		 */
		
		System.out.println(triangle(0)); 
		System.out.println(triangle(1)); 
		System.out.println(triangle(2)); 	
		System.out.println(triangle(3)); 	
		System.out.println(triangle(4)); 	
		System.out.println(triangle(5)); 
		System.out.println(triangle(6));
		System.out.println(triangle(7));
	}
	
	public static int triangle(int rows) {
		  if(rows == 0){
		    return 0;
		  }
		  
		  return triangle(rows - 1)+rows;
		}

	
}

