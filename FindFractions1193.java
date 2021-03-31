import java.util.Scanner;

public class FindFractions1193 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int i=1;
		
		while (num> i) {
			num=num-i;
			i++;
		} 
		if (i%2==0) {
			System.out.println(num+"/"+(i+1-num));
		}
		else System.out.println((i+1-num)+"/"+num);
	}
}