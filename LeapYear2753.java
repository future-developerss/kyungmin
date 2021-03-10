import java.util.Scanner;

public class LeapYear2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LeapYearis());
	}
	
	public static int LeapYearis() {
		Scanner in=new Scanner(System.in);
		
		int year=in.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					return 1;
				}
				return 0;
			}
			return 1;
		}
		
		else {
			return 0;
		}	
	}
		
}