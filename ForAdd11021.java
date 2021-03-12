import java.util.Scanner;

public class ForAdd11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for (int i=0; i<num; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[i]=a+b;
		}
		
		for (int i=0; i<num; i++) {
			System.out.println("Case #"+(i+1)+": "+ arr[i]);
		}
	}
}