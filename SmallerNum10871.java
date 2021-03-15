import java.util.Scanner;

public class SmallerNum10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x=sc.nextInt();
		int[] numbers=new int[num];
		
		for (int i=0; i<num; i++) {
			int y=sc.nextInt();
			if (y<x) System.out.print(y+" ");
		}
		
	}
}
