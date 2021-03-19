import java.util.Scanner;

public class Hansu1065 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println(hansu(sc.nextInt()));
		sc.close();
	}
	
	public static int hansu(int number) {
		int count=99;

		if (number<100) {
			return number;
		}
		else {	
			for (int i=100; i<=number; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;
				if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
					count++;
				}
			}
			return count;
		}	
	}
}
