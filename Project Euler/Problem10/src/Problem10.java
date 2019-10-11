import java.util.ArrayList;

public class Problem10 {
	
	private static boolean isPrime(long x){
		
		for (int i = 2; i<=x; i++){
			
			if (x == i)
				return true;
			if (x%i == 0)
				return false;
		}

		return false;
	}

	public static void main(String[] args) {
		
		ArrayList<Long> primes = new ArrayList<Long>();
		
		for (long i = 2; i<2000000; i++){
			if (isPrime(i)){
				primes.add(i);
				System.out.println("Found Prime: " + i);
			}
		}
		
		long sum = 0;
		
		for (int i = 0; i<primes.size(); i++){
			sum += primes.get(i);
		}
		
		System.out.println(sum);
	}

}
