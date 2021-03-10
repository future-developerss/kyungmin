import java.util.Scanner;

public class Quadrant14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int x=in.nextInt();
		int y=in.nextInt();
		
		if (x>0) {
			if (y>0) {
				System.out.println("1");
			}
			else System.out.println("4");
		}
		
		else {
			if (y>0) {
				System.out.println("2");
			}
			else System.out.println("3");	
		}

	}
}
