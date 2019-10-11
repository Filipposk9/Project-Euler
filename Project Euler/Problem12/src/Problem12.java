
public class Problem12 {

	private static long highlyDivisibleTriangularNumber(){
		
		int divisors = 0;
		long triangularNumber = 0;
		int end = 1;
		int sqrt;
		
		while (divisors<=500){
			divisors = 0;
			triangularNumber += end;
			end++;
			sqrt = (int) Math.sqrt(triangularNumber);

			for (int i = 1; i<=sqrt; i++){
				if (triangularNumber%i == 0)
					divisors+=2;
			}
			
			if (sqrt*sqrt == triangularNumber)
				divisors--;
			
			System.out.println("Triangular Number " + triangularNumber + " has " + divisors + " divisors");
		}
		
		return triangularNumber;
	}
	public static void main(String[] args) {
		
		System.out.println(highlyDivisibleTriangularNumber());

	}

}
