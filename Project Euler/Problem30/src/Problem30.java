import java.util.ArrayList;
public class Problem30 {

	public static void main(String[] args) {

		int number;
		int x,y,z,w,v,u;
		int sum = 0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int a = 0; a<10; a++){
			for (int b = 0; b<10; b++)
				for (int c = 0; c<10; c++)
					for (int d = 0; d<10; d++)
						for (int e = 0; e<10; e++)
							for (int f = 0; f<10; f++){
								number = a*100000+b*10000+c*1000+d*100+e*10+f;
								x = (int) Math.pow(a,5);
								y = (int) Math.pow(b,5);
								z = (int) Math.pow(c,5);
								w = (int) Math.pow(d,5);
								v = (int) Math.pow(e,5);
								u = (int) Math.pow(f,5);
								if (number == (x+y+z+w+v+u))
									numbers.add(number);
							}
							
		}
		
		for (int i = 0; i<numbers.size(); i++){
			sum += numbers.get(i);
		}
		
		System.out.println(sum);

	}

}
