import java.util.ArrayList;
import java.util.Collections;
public class Problem36 {
	
	public static void main(String args[]){
		
		int number = 0;
		int x,y = 1;
		int first, second, third, fourth, fifth, sixth;
		int temp1, temp2;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 100; i<1000; i++){
			x = i;
			for (int j = 100; j<1000; j++){
				y = j;
				number = x*1000+y;
				sixth = (x/100);
				temp1 = (x%100);
				fifth = (temp1/10);
				fourth = (temp1%10);
				third = (y/100);
				temp2 = (y%100);
				second = (temp2/10);
				first = (temp2%10);
				
				if ((sixth == first) && (fifth == second) && (fourth == third)){
					numbers.add(number);
				}
					
			}
		}

		Collections.sort(numbers);
		System.out.println(numbers);
		
	}

}
