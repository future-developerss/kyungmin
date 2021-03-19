public class SelfNum4673 {

	public static void main(String[] args) {
		boolean[] check=new boolean[10001];
		
		for (int i=1; i<10001; i++) {
			int n=d(i);
			
			if (n<10001) {   // 셀프 넘버를 인덱스로 갖고있는 배열의 값를 true로 바꾸기
				check[n]=true;
			}
		}
		
		//StringBuilder는 변경할 수 있는 문자열을 의미한다. 
		StringBuilder sb=new StringBuilder();
		
		/*StringBuilderr 설명: String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 
		 * 기존의 데이터를 더하는 방식을 사용하여 속도도 빠르며 상대적으로 부하가 적다.
		 * 기존 String 객체의 경우 str1+str2와 같은 연산을 하게 되면 새로운 String을 생성한다. 
		*/
		
		for (int i=1; i<10001; i++) {
			if (!check[i]) {   // 배열의 값이 false인 것들을 sb에 추가하기
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);  //sb 내용 출력
	}
	
	public static int d(int number) {  //d(n)함수 구현: 값의 각 자리수와 원래 수의 합
		int sum=number;     
		
		while(number!=0) {        // 각 자리의 수를 sum에 더하기
			sum=sum+(number%10);  // number%10은 가장 작은 자리수 구해진다. 
			number=number/10;
		}
		return sum;
	}
}