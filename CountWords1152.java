import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * 일반적인 상황에서는 arr.split(" ")과 token은 동일하게 작동하지만
 * token은 문자열 사이 공백만 고려하고
 * split는 걍 공백 모두 고려
 * */

public class CountWords1152 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		sc.close();
		
		StringTokenizer st=new StringTokenizer(line," ");
		System.out.println(st.countTokens());
	}
}
