import java.io.BufferedReader;   //버퍼를 이용한 입력 (Scanner에 비해 빠름)
import java.io.BufferedWriter;   //버퍼를 이용한 출력
import java.io.IOException;      //운영 체제의 반환 코드가 다른 예외 유형에 직접 매핑되지 않는 오류에 대해 throw됩니다.
import java.io.InputStreamReader;    // 바이트 스트림에서 문자 스트림으로 전환
import java.io.OutputStreamWriter;   //문자 스트림에서 바이트 스트림으로의 변환을 제공하는 입출력 스트림


/* 버퍼: 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 임시 메모리 영역
 * 입출력 속도 상승하기 위해 버퍼 사용
 * 버퍼 플러시: 버퍼가 남아 있는 데이터 출력 (버퍼 비움)
 * 
 * Stream: 바이트 단위의 입출력
 * Reader/Writer: 캐릭터 단위 입출력
 * 
 * Byte Stream: 데이터를 있는 그대로 송수신 하는 Stream
 * Character Stream: Reader와 Writer를 달고 있다. 모두 문자단위로 인코딩 처리를 하는 Stream
 */

public class FastAB15552 {
	
	// throws IOException: 예외가 발생했을 때 직접 처리하지 않고 다른 곳에서 처리하도록 예외를 던짐
	public static void main(String[] args) throws IOException {   
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    //문자 스트림으로 변환된 입력 값을 버퍼 이용해 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  //바이트 스트림으로 변화된 값 버퍼를 이용해 출력
        
        //parseInt(): 문자열을 특정 진수(수의 진법 체계에 기준이 되는 값)의 정수를 반환.
        int n = Integer.parseInt(br.readLine().trim());   //라인 하나 읽고 정루로 반환한 뒤 변수 n에 대입
        
        for(int i=0; i<n; i++) {
            String input = br.readLine();
            String [] word = input.split(" ");   //베열 안 믄자 공백 기준으로 분리
            int a = Integer.parseInt(word[0]);   //문자 정수로
            int b = Integer.parseInt(word[1]);
            bw.write((a+b) + "\n");              //출력
        }
        
        bw.flush();   //버퍼가 남은 데이터 출력
        bw.close();
        br.close();
	}
}
