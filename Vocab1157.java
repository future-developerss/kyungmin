import java.util.Scanner;

public class Vocab1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		word=word.toUpperCase();
		int[] arr=new int[26];
		sc.close();
		
		int i;
		for (i=0; i<word.length(); i++) {
			 arr[word.charAt(i)-'A']+=1;
		}
		
		int max=0;
		char res='?';
		for (i=0; i<26; i++) {
			if (arr[i]>max) {
				max=arr[i];
				res=(char)(i+65);
			}
			else if (arr[i]==max) {
				res='?';
			}
		}
		System.out.print(res);
	}

}
