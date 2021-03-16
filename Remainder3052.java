
import java.util.Scanner;
import java.util.HashSet;

public class Remainder3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> h=new HashSet<Integer>();

		for (int i=0; i<10; i++) {
			h.add(sc.nextInt()%42);   //중복되지 않는 배열만 저장
		}
		sc.close();
		System.out.print(h.size());

	}
}
