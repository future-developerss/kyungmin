import java.util.Scanner;
import java.lang.Math;

public class Rectangle1085 {

	public static void main(String[] args) {
		
		/*
		 * 가장 잛은 직선을 구하면 직사각형과의 최소거리
		 */
		Scanner sc=new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int x_min = Math.min(x, w-x);	// x축 최소거리
		int y_min = Math.min(y, h-y);	// y축 최소거리
		
		System.out.println(Math.min(x_min, y_min));
		
		
		
	}

}