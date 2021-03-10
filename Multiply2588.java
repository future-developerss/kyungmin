import java.lang.Math;
import java.util.Scanner;

public class Multiply2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		
		int number1=num.nextInt();
		int number2=num.nextInt();
		int res=0;
		
		for (int i=1; i<4; i++) {
			int sum=number2%10;
			number2/=10;
			
			System.out.println(number1*sum);
			res+=(number1*sum)*Math.pow(10,i-1);
		}
		System.out.println(res);
	}
}
