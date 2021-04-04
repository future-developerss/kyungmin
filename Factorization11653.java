import java.util.Scanner;

public class Factorization11653 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		while (num%2==0) {
			System.out.println("2");
			num/=2;
		}
		
		for (int i=3; i<=num; i+=2) {
			while (num%i==0) {
				System.out.println(i);
				num/=i;
			}
		}
	}
}
