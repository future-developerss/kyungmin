import java.util.Scanner;

public class StringRepeat2675 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for (int i=0; i<num; i++) {
			int repeat=sc.nextInt();
	    	//nextLine으로 입력하면 입력 과정에서 숫자와 문자 사이 공백까지 앍는다. (오류)
			String word=sc.next();  
			for (int j=0; j<word.length(); j++) {
				for (int k=0; k<repeat; k++) System.out.print(word.charAt(j));
			}
			System.out.println();
		}
		sc.close();
	}
}
