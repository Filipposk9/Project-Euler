
public class Problem20 {
	
	private static double factorial(int x){
		
		double y = 1;
		
		if (x==0)
			return 1;
		else if (x==1)
			return 1;
		else
			for (int i = 1; i<=x; i++){
				y = y*i;
			}
		return y;
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(100));

	}

}
