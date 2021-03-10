import java.util.Scanner;

public class Remainder10439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);

	}

}
