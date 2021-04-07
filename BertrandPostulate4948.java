import java.lang.Math;
import java.util.Scanner;

public class BertrandPostulate4948 {
	
	public boolean isPrime (int num) {
		if (num==1) return false;
		if (num==2) return true;
		for (int i=2;i<=Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}	
		return true;
	}
	
	public int countPrime(int num) {
		int count=0;
		for (int i=(num+1); i<=2*num; i++) {
			if (isPrime(i)==true) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BertrandPostulate4948 func=new BertrandPostulate4948();
		
		int num=sc.nextInt();
		while(num!=0) {
			System.out.println(func.countPrime(num));
			num=sc.nextInt();
		}
		sc.close();
	}
}