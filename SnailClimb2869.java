import java.util.Scanner;

public class SnailClimb2869 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int up=sc.nextInt();
		int down=sc.nextInt();
		int height=sc.nextInt();
		sc.close();
		
		int days=0;
		while (true) {
			height-=up;
			++days;
			if (height<=0) break;
			height+=down;
		}
		System.out.println(days);
				
	}
}
