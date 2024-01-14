import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");// 왼쪽 직각 삼각형 담당
			}
			for (int j = 0; j < N - i; j++) { // 공백만큼 밀려서 출력
				System.out.print("*"); // 0부터 N-0까지 *출력...한줄..1부터 N-1출력...
			}
			System.out.println();
		}

	}

}