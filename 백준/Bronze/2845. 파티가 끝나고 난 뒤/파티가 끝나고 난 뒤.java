import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력먼저
		int L = sc.nextInt(); //범위당 사람의 수
		int P = sc.nextInt(); //파티장 넓이
		
		//5개의 문자열 배열 입력
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		
		//값 비교해서 출력
		int dap = L*P;
		for(int i=0; i<5; i++) {
			System.out.println(num[i]-dap);
		}
	}
}