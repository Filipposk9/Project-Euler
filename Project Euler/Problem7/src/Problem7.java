import java.util.ArrayList;

public class Problem7 {
	
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
		
		long x = 2;
		
		while (primes.size() <= 10001){
			if (isPrime(x))
				primes.add(x);
			x++;
		}

		System.out.println(primes.get(10000));
	}

}
