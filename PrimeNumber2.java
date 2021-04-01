import java.util.Scanner;

public class PrimeNumber2 {
	
	boolean isPrime(int number) {
		if (number==1) return false;
		
		for (int i=2; i<Math.sqrt(number); i++) {
			if (number%i==0)  return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		PrimeNum1978 findPrime=new PrimeNum1978();
		
		for (int i=0; i<num; i++) {
			if (findPrime.isPrime(sc.nextInt())) count++;
		}
		sc.close();
		System.out.println(count);
	}
}