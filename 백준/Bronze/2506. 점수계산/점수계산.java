import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt(); //문제 개수 입력받기
		int[] result = new int[P]; //P개의 값을 입력받는 배열 result
		
		for (int i=0; i<P; i++) {//P개의 값 입력해서 배열에 담고
			result[i] = sc.nextInt();
		}

		//풀이
		int total = 0; //총점수
		int cnt = 0; //문제 연속으로 맞을 때 더할 점수
		
		for(int i:result){
			if(i==1) {
				cnt ++;
				total +=cnt;
			}else {
				cnt = 0;
			}
		}
		System.out.println(total);
	}

}