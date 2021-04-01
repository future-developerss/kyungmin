import java.util.Scanner;

public class AllPrime2581 {
	
	public static int isPrime(int number) {
		if (number==1) return 0;
		
		for (int i=2; i<Math.sqrt(number); i++) {
			if (number%i==0)  return 0;
		}
		return number;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		
		int res=0;
		
		for (int i=num1; i<=num2; i++) {
			int prime=isPrime(i);
			res+=prime;
		}
		
		if (res>0) {
			System.out.println(res);
			for (int i=num1; i<=num2; i++) {
				if (isPrime(i)!=0) {
					System.out.println(isPrime(i));
					break;
				}
			}
		}
		else System.out.println(-1);
	}
}