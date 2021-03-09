import java.util.Scanner;

public class plus1000 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);  //System.in: 입력 값
		
		int x=in.nextInt();  //int를 입력 받을 때 nextInt 메서드를 사용
		int y=in.nextInt();
		
		in.close();
		
		int res=x+y;
		System.out.println(res);

	}

}