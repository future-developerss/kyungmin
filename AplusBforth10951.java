import java.util.Scanner;

public class AplusBforth10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		while(in.hasNextInt()) {  // 다음 입력값이 있을 때
			int a=in.nextInt();
			int b=in.nextInt();
			System.out.println(a+b);
		}
		in.close();

	}
}
