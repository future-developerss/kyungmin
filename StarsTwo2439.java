import java.util.Scanner;

public class StarTwo2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.close();
		
		for (int i=1; i<=num; i++) {
			for (int j=0; j<num; j++) {
				if (j<num-i)
					System.out.print(" ");  //print는 println과 다르게 줄바꿈 없음
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}