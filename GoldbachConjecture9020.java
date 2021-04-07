import java.lang.Math;
import java.util.Scanner;

public class GoldbachConjecture9020 {
	
	public boolean isPrime(int number) {
		if (number==1) return false;
		if (number==2) return true;
		
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int times=sc.nextInt();
		
		GoldbachConjecture9020 func=new GoldbachConjecture9020();
		for (int i=0; i<times; i++) {
			int num=sc.nextInt();
			int one=num/2;
			while (true) {
				if (func.isPrime(one)==true &func.isPrime(num-one)==true) {
					System.out.println((num-one)+" "+one);
					break;
				}
				else one++;
			}
		}
		sc.close();
	}
}
