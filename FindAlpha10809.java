import java.util.Scanner;

public class FindAlpha10809 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		int[] alpha=new int[26];
		int i=0;
		sc.close();
		
		for (i=0; i<26; i++) {
			alpha[i]=-1;
		}

		for (i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			if (alpha[ch-'a']==-1) {   //제일 먼저 등장한 것의 index만 사용
				alpha[ch-'a']=i;   //ASCII 기준으로 문자에서 'a'를 뺀 숫자가 알파벳의 인덱스
			}
		}
		for (i=0; i<26; i++) {
			System.out.printf("%d ", alpha[i]);
		}
	}
}
