import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OXquiz {

	public static void main(String[] args)  throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());   // 정수 입력 받기
		
		String arr[]= new String[num];  //한 줄씩 배열에 위치
		
		// 배열에 입력 값 저장
		for (int i=0; i<num; i++) {
			arr[i]=br.readLine();   //한 줄씩 입력 값 받아 배열에 저장하기
		}
		
		for (int i=0; i<num; i++) {
			int count=0;
			int sum=0;
			
			for (int j=0; j<arr[i].length(); j++) {
				if (arr[i].charAt(j)=='O') ++count;   // charAt이라는 코드!!
				else count=0;
				sum+=count;
			}
			System.out.println(sum);
		}
	}

}