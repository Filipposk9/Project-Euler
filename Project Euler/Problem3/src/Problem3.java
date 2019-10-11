import java.util.ArrayList;

public class Problem3 {
	
	static double x = 600851475143.0;
	static double z = 1;
	
	private static boolean isPrime(long x){
		for (int i = 2; i<=x; i++){
			
			if (x == i)
				return true;
			if (x%i == 0)
				return false;
		}

		return false;
	}
	
	private static int largestPrimeFactor(ArrayList<Integer> primes){
		int i = 0;
		
		while (z != x){
			if (x%primes.get(i) == 0)
				z = z*primes.get(i);
			i++;
		}
		return primes.get(i-1);
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 0; i<10000; i++){
			if (isPrime(i))
				primes.add(i);
		}
		
		System.out.println(largestPrimeFactor(primes));

	}

}
