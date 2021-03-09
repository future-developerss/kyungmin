import java.util.Scanner;

public class multiply10998 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);  //System.in: 입력 값
		                                    //Scanner는 입력 받을 때 쓰임 (정수, 실수, 문자열 읽어 올 수 있다)
		
		int x=in.nextInt();  //int를 입력 받을 때 nextInt 메서드를 사용
		int y=in.nextInt();
		
		in.close();
		
		int res=x*y;
		System.out.println(res);

	}

}
