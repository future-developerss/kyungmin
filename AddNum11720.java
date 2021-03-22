import java.util.Scanner;

public class AddNum11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String numbers=sc.next();   //nextLine(): 다음 enter까지 return
		                            //next(): 다음 공백까지 return 
		sc.close();
		int sum=0;

		for (int i=0; i<num; i++) {
			sum+=numbers.charAt(i)-'0';  //charAt: String에서 일부분 갖고옴
			
		}
		System.out.println(sum);
	}
}