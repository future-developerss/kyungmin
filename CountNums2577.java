import java.util.Scanner;

public class CountNums2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int sum=0;
		
		int num=x*y*z;
		int[] count= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		while (num>0) {
			sum=num%10;
			num/=10;
			count[sum]+=1;
		}
		for (int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
		
	}
}
