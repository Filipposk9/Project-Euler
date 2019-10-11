import java.util.ArrayList;
public class Problem1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 1; i<1000; i++){
			if ((i%3 == 0) || (i%5 == 0))
				numbers.add(i);
		}
		
		long sum = 0;
		
		for (int i = 0; i<numbers.size(); i++){
			sum += numbers.get(i);
		}
		
		for (int element: numbers)
			System.out.println(element);

		System.out.println(sum);
		
	}

}
