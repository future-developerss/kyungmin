import java.util.Scanner;

public class Calculation10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num=new Scanner(System.in);  //System.in: 입력 값
        //Scanner는 입력 받을 때 쓰임 (정수, 실수, 문자열 읽어 올 수 있다)

		int x=num.nextInt();  //int를 입력 받을 때 nextInt 메서드를 사용
		int y=num.nextInt();  //double을 입력 받을 때 nextDouble 메서드를 사용

		num.close();

		int[] numbers= {x+y,x-y,x*y,x/y,x%y};
		
		for (int i=0;i<5; i++) {
			System.out.println(numbers[i]);
		}
		

	}

}
