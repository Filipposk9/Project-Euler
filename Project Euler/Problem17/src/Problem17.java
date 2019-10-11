
public class Problem17 {
	
	private static int hundreds(int x){
		
		if (x<100)
			return tens(x);
		if ((x>100) && (x<200))
			return 13 + tens(x-100);
		if ((x>200) && (x<300))
			return 13 + tens(x-200);
		if ((x>300) && (x<400))
			return 15 + tens(x-300);
		if ((x>400) && (x<500))
			return 14 + tens(x-400);
		if ((x>500) && (x<600))
			return 14 + tens(x-500);
		if ((x>600) && (x<700))
			return 13 + tens(x-600);
		if ((x>700) && (x<800))
			return 15 + tens(x-700);
		if ((x>800) && (x<900))
			return 15 + tens(x-800);
		if ((x>900) && (x<1000))
			return 14 + tens(x-900);
		if (x == 100)
			return 10;
		if (x == 200)
			return 10;
		if (x == 300)
			return 12;
		if (x == 400)
			return 11;
		if (x == 500)
			return 11;
		if (x == 600)
			return 10;
		if (x == 700)
			return 12;
		if (x == 800)
			return 12;
		if (x == 900)
			return 11;
		if (x == 1000)
			return 11;
		return 0;
	}
	
	private static int tens(int x){
		
		
		if ((x<20))
			return numbers(x);
		if((x>=20) && (x<30))
			return 6 + numbers(x-20);
		if ((x>=30) && (x<40))
			return 6 + numbers(x-30);
		if ((x>=40) && (x<50))
			return 5 + numbers(x-40);
		if ((x>=50) && (x<60))
			return 5 + numbers(x-50);
		if ((x>=60) && (x<70))
			return 5 + numbers(x-60);
		if ((x>=70) && (x<80))
			return 7 + numbers(x-70);
		if ((x>=80) && (x<90))
			return 6 + numbers(x-80);
		if ((x>=90) && (x<100))
			return 6 + numbers(x-90);
		return 0;
	}
	
	private static int numbers(int x){
		
		switch (x){
		case 0:{
			return 0;
		}
		case 1:{
			return 3;
		}
		case 2:{
			return 3;
		}
		case 3:{
			return 5;
		}
		case 4:{
			return 4;
		}
		case 5:{
			return 4;
		}
		case 6:{
			return 3;
		}
		case 7:{
			return 5;
		}
		case 8:{
			return 5;
		}
		case 9:{
			return 4;
		}
		case 10:{
			return 3;
		}
		case 11:{
			return 6;
		}
		case 12:{
			return 6;
		}
		case 13:{
			return 8;
		}
		case 14:{
			return 8;
		}
		case 15:{
			return 7;
		}
		case 16:{
			return 7;
		}
		case 17:{
			return 9;
		}
		case 18:{
			return 8;
		}
		case 19:{
			return 8;
		}
		default:
			return 0;
		}
		
	}
	
	public static void main(String args[]){
		
		int count = 0;
		for (int i = 1; i<=1000; i++)
			count += hundreds(i);
		System.out.println(count);
	}

}
