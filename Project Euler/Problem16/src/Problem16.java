import java.util.ArrayList;

public class Problem16 {

    private static ArrayList<Integer> stringToArray(String s){
           
    		ArrayList<Integer> numbers = new ArrayList<Integer>();
            int count = 0;
           
            for (int i = 0; i<s.length(); i++){
                 numbers.add(Integer.parseInt(s.substring(count, count +1)));
                 count++;
            }
            return numbers;   
    }
	
	public static void main(String args[]){
		
		String x = "10715086071862673209484250490600018105614048117055336074437503883703510511249361224931983788156958581275946729175531468251871452856923140435984577574698574803934567774824230985421074605062371141877954182153046474983581941267398767559165543946077062914571196477686542167660429831652624386837205668069376";
		
		ArrayList<Integer> numbers = stringToArray(x);
		double sum = 0.0;
		
		for (int i = 0; i<numbers.size(); i++){
			sum += numbers.get(i);
		}
		System.out.println(sum);
	}

}
