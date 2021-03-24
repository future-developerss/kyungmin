
import java.util.Scanner;

public class Constant2908 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		String one="";
		String two="";
		
		//Integer.toString(정수): 정수를 문자열로 바꿈
		while (num1>0) {
			String number= Integer.toString(num1%10);
			one=one.concat(number);
			num1/=10;
		}
		
		while (num2>0) {
			String number= Integer.toString(num2%10);
			two=two.concat(number);
			num2/=10;
		}
		
		//Integer.parseInt(문자열): 문자열을 정수로 바꿈
		num1= Integer.parseInt(one);
		num2= Integer.parseInt(two);
		
		if (num1>num2) System.out.print(num1);
		else System.out.print(num2);

	}

}
