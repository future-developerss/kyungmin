import java.util.Scanner;

public class BeeHouse2292 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		int count=1;
		while (num-1>0) {
			num-=6*count;
			count++;	
		}
		System.out.println(count);
	}
}
