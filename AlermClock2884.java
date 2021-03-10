import java.util.Scanner;

public class AlermClock2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clock=new Scanner(System.in);
		
		int hour1=clock.nextInt();
		int min1=clock.nextInt();
		
		if (min1>=45) {
			min1=min1-45;
		} 
		
		else {
			if (hour1==0) {
				hour1=23;
			} else {
				hour1-=1;
			}
			min1+=15;
		}
		
		System.out.println(hour1);
		System.out.println(min1);
	}

}
