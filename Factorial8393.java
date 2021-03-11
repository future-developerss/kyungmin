import java.util.Scanner;

public class Factorial8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int res=0;
		
		if (num==1) {
			System.out.println("1");
		}
		
		else {
			for (int i=1; i<=num; i++) {
				res+=i;
			}
			System.out.println(res);
		}
		

	}
}
