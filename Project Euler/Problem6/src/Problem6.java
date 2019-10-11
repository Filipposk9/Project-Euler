
public class Problem6 {
	
	private static int sumOfSquares(){
		
		int y = 1;
		int sum = 0;
		
		for (int i = 1; i<=100; i++){
			y = (int) Math.pow(i, 2);
			sum += y;
		}
		return sum;
	}
	
	private static int squareOfSums(){
		
		int sum = 0;
		
		for (int i = 1; i<=100; i++){
			sum += i;
		}
		
		int squaredSum = (int) Math.pow(sum,2);

		return squaredSum;
		
	}
	
	public static void main(String args[]){
		
		int sumOfSquares = Problem6.sumOfSquares();
		int squareOfSums = Problem6.squareOfSums();
		
		System.out.println(squareOfSums-sumOfSquares);
	}

}
