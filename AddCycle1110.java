import java.util.Scanner;

public class AddCycle1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int newNum=num;
		int count=0;
		
		while (true) {
			if (newNum<10) {
				newNum=newNum*11;
			}
			else {
				newNum=(newNum%10)*10+((newNum/10)+newNum%10)%10;
			}
			count++;
			if (newNum==num) break;
		}
		System.out.println(count);
		
	}

}
