import java.util.Scanner;

public class divide1008 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);  //System.in: 입력 값
		                                    //Scanner는 입력 받을 때 쓰임 (정수, 실수, 문자열 읽어 올 수 있다)
		
		double x=in.nextDouble();  //int를 입력 받을 때 nextInt 메서드를 사용
		double y=in.nextDouble();  //double을 입력 받을 때 nextDouble 메서드를 사용
		
		in.close();
		
		double res=x/y;
		System.out.println(res);

	}

}
