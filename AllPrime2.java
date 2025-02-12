import java.util.Scanner;
 
public class Main {
 
	public static boolean prime[];
	
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		int N = in.nextInt();
		
		prime = new boolean[N + 1];	// 배열 생성 (소수면 false 값 저장)
		get_prime();
		
		
		// 소수 합 및 최솟값 
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(prime[i] == false) {	// false = 소수 
				sum += i;
				if(min == Integer.MAX_VALUE) {	// 첫 소수가 최솟값임  
					min = i;
				}
			}
		}
		
		if(sum == 0) {	// 소수가 없다면 
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
 
	
	// 에라토스테네스 체 알고리즘
        // k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외 
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
}
 