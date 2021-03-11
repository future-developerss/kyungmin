import java.util.Scanner;

public class ForAdd10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int repeatNum=sc.nextInt();
		int[] arr= new int[repeatNum];
		int i;
		
		for (i=0; i<repeatNum; ++i) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[i]=a+b;
		}
		
		for (i=0; i<repeatNum; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
