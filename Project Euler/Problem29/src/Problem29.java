import java.util.ArrayList;
public class Problem29 {

	public static void main(String[] args) {
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		for (int i = 2; i<=100; i++){
			for (int j = 2; j<=100; j++){
				if(!(numbers.contains(Math.pow(i, j))))
					numbers.add(Math.pow(i, j));
			}
		}
		
		System.out.println(numbers.size());
		
	}

}
