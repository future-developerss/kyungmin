import java.util.Scanner;

public class AboveAve4344 {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();            //줄의 총 개수
		double[] arr=new double[num];    //평균 넘는 학생들의 비율 담은 배열 (인덱스, 행)
		
		int i;
		for (i=0; i<num; i++) {
			double res=0;   //평균 넘는 학생의 명수
			double sum=0;                     //한 줄의 점수들의 총 합
			int count=sc.nextInt();           //한 줄에 등장할 점수 개수
			double[] row=new double[count];   //점수들 들은 배열
			
			for (int j=0; j<count; j++) {   //점수들 입력 받기
				row[j]=sc.nextInt();
				sum+=row[j];
			}
			for (int j=0; j<count; j++) {
				if (row[j]>(sum/count)) {   //평균 엄는 학생수 구하기
					res++;
				}
			}
			arr[i]=(res/count)*100;
		}
		sc.close();
		
		for (i=0; i<num; i++) {
			System.out.printf("%.3f%%\n", arr[i]);
		}

	}
}
