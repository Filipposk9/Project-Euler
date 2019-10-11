
public class Problem4 {
	
	public static void palindromicNumberGenerator(){
		
		int number = 0;
		int x,y = 1;
		int first, second, third, fourth, fifth, sixth;
		int temp1, temp2, temp3, temp4, temp5;
		int max = 1;
		
		for (int i = 100; i<999; i++){
			x = i;
			for (int j = 100; j<999; j++){
				y = j;
				number = x*y;
				sixth = (number/100000);
				temp1 = (number%100000);
				fifth = (temp1/10000);
				temp2 = (temp1%10000);
				fourth = (temp2/1000);
				temp3 = (temp2%1000);
				third = (temp3/100);
				temp4 = (temp3%100);
				second = (temp4/10);
				temp5 = (temp4%10);
				first = (temp5/1);	
				
				if ((sixth == first) && (fifth == second) && (fourth == third)){
					if (number>max)
						max = number;
				}
					
			}
		}
		System.out.println(max);
	}
	public static void main(String args[]){
		
		Problem4.palindromicNumberGenerator();
		
	}

}
