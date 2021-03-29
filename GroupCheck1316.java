import java.util.Scanner;

public class GroupCheck1316 {
	static Scanner in = new Scanner(System.in);
	 
	public static void main(String[] args) {
		int count = 0;          // group 단어 개수 세기
		int N = in.nextInt();   // 입력 받을 단어 개수
 
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	// 그룹 단어인지 확인하는 함수
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = in.next();  //단어 입력
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)
			
			if (prev != now) {	 // 앞선 문자와 i 번째 문자가 같지 않다면?	
				if ( check[now - 'a'] == false ) {  // 해당 문자가 처음 나오는 경우 (false 인 경우)
					check[now - 'a'] = true;		// true 로 바꿔준다
					prev = now;					    // 다음 턴을 위해 prev 도 바꿔준다 
				}

				else return false;    // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아님) 함수 종료
			}
		}    
		return true;
	}
}
