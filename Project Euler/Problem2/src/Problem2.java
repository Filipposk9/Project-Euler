
public class Problem2 {
	
	public static int fibonacci(int x){
		if ((x==1) || (x==0))
			return 1;
		else
			return fibonacci(x-1) + fibonacci(x-2);
	}

	public static void main(String[] args) {
		
		int sum = 0;
		int x = 1;
		
		while(fibonacci(x)<4000000){
			if (fibonacci(x) % 2 == 0)
				sum = sum + fibonacci(x);
			x+=1;
		}
		
		System.out.println(sum);

	}

}
