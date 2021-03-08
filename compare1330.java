import java.util.Scanner;

public class compare1330 {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		
		int x=in.nextInt();
		int y=in.nextInt();
		in.close();
		
		if (x>y) {
			System.out.println(">");
		}
		else if (x<y) {
			System.out.println("<");
		}
		else {
			System.out.println("=");
		}

	}

}
