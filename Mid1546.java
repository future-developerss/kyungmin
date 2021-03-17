import java.util.Scanner;

public class Mid1546 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		float[] arr=new float[num];
		float sum=0;
		
		for (int i=0; i<num; i++) {
			arr[i]=sc.nextFloat();
		}
		float max=arr[0];
		
		for (int i=0; i<num; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		
		for (int i=0; i<num; i++) {
			sum+=arr[i]/max*100;
		}
		
		System.out.println(sum/num);

	}
}
