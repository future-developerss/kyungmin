import java.util.Scanner;

public class Max2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[9];
		int ind=0;
		
		for (int i=0; i<9; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for (int i=1; i<9; i++) {
			if (max<arr[i]) {
				max=arr[i];
				ind=i;
			}
		}

		System.out.println(max);
		System.out.println(ind+1);

	}

}
