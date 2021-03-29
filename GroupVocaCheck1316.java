import java.util.Scanner;

public class GroupVocaCheck1316 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();           //총 단어 개수 담을 변수
		String[] voca=new String[num];  //단어 담을 변수
		int[] alph=new int[26];   
		int count=0;   //그룹 단어 개수 담을 변수
		
		for (int i=0; i<num; i++) {
			String word=sc.next();   //3개의 단어를 voca 배열에 담기
			alph[word.charAt(0)-'a']+=1;  //처음 등장하는 알파벳을 아스키코드로 바꿔 index 위치 값 증가
			for (int j=1; j<word.length(); j++) {
				if (word.charAt(j)!=word.charAt(j-1)) {  //이전 단어와 다를 때만 index 위치 값 증가
					alph[word.charAt(j)-'a']+=1;
				}
			}
			count++;
			for (int j=0; j<26; j++) {
				if (alph[i]!=0 && alph[i]!=1)  {
					count--;
					alph[i]=0;
					break;
				}
				alph[i]=0;
			}
		}
		sc.close();
		System.out.println(count);
	}
}