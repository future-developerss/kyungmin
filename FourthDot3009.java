import java.util.Scanner;

public class FourthDot3009 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] xarr=new int[3];
		int[] yarr=new int[3];
		int x, y;
		
		for (int i=0; i<3; i++) {
			xarr[i]=sc.nextInt();
			yarr[i]=sc.nextInt();
		}
		sc.close();
		
		x=xarr[0];
		y=yarr[0];
		for (int i=1; i<3; i++) {
			if (xarr[0]==xarr[i]) x=xarr[3-i];
			if (yarr[0]==yarr[i]) y=yarr[3-i];
		}
		
		System.out.println(x+" "+y);
	}
}
