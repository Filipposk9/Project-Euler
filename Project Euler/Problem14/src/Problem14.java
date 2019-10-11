
public class Problem14 {
	
	private static void collatzSequence(){
		
		int maxCount = 0;
		int max = 0;
		int count = 1;
		for (int i = 999999; i>1; i--){
			
			int x = i;
			
			while (x != 1){
				
				if (x%2 == 0){
					x = x/2;
				}
				else
					x = 3*x+1;
				
				count++;
			}
			
			if (count>maxCount){
				maxCount = count;
				max = i;
				System.out.println("Found new max: " + max);
				System.out.println("Produced terms: " + count);
			}
			
			count = 0;
			
		} //end for
		
		
	}

	public static void main (String args[]){
		collatzSequence();
	}

}
