
public class Problem34 {
	
	private static int factorial(int x){
		if (x == 0)
			return 1;
		else
			return (factorial(x-1))*x;
	}

	public static void main(String[] args) {
		
		int a,b,c,d,e,f;
		int w,x,y,z,q,r;
		
		for (int i = 10; i<99; i++){
			f = i/10;
			r = i%10;
			
			if (i == factorial(f)+factorial(r))
				System.out.println(i);
		}

	}

}
