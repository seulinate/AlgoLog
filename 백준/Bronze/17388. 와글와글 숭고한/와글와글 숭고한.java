import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3개 대학 참여도 입력 ( 단, 모든 참여도 다름 ) 
		int S = sc.nextInt();
		int K = sc.nextInt();
		int H = sc.nextInt();
		
		int sum = S+H+K; //점수 다 더한값
		
//		//두번에 나눠서 구분하거나 
//		int min = Math.min(S, K);
//		min = Math.min(min, H);
		int min = Math.min(Math.min(S, K),H); //이렇게 한줄로 코딩
		
		
		
		if(sum >= 100) {
			System.out.println("OK");
		}else {
			if(min == S) {
				System.out.println("Soongsil");
			}else if(min == K) {
				System.out.println("Korea");
			}else {
				System.out.println("Hanyang");
			}
		}
		
	}

}
