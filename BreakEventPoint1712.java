
import java.util.Scanner;

public class BreakEventPoint1712 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fixedCost=sc.nextInt();
		int oneCost=sc.nextInt();
		int price=sc.nextInt();
		sc.close();
		
		if (oneCost>=price) System.out.println("-1");
		else {
			System.out.println(fixedCost/(price-oneCost)+1);
		}

	}
}
