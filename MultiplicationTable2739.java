import java.util.Scanner;

public class MultiplicationTable2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		
		int num=inp.nextInt();
		inp.close();
		
		for (int i=1; i<10; i++) {
			int res=num*i;
			System.out.println(num+" * "+i+" = "+res);
		}

	}

}
