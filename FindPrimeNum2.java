import java.util.Scanner;

public class FindPrimeNum2 {
	
	boolean isPrime(int number) {
		if (number==1) return false;
		
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number%i==0)  return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		sc.close();
		
		FindPrimeNum2 findPrime=new FindPrimeNum2 ();
		
		for (int i=min; i<=max; i++) {
			if (findPrime.isPrime(i)) System.out.println(i);
		}

	}
}
