import java.util.Scanner;

public class SnailClimb2869 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int up=sc.nextInt();
		int down=sc.nextInt();
		int height=sc.nextInt();
		sc.close();
		
        int day = (height - down) / (up - down);
        
		// 나머지가 있을 경우 (잔여 블럭이 있을 경우)
		if ((height - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
				
	}
}