import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//기차속도
		int s = sc.nextInt();
        
		//파리 속도
		int t = sc.nextInt();
        
		//처음 두 기차 사이 거리
		int d = sc.nextInt();
		
		//int time = 200/(50*2) 이 식대로 변수 넣어주면 ? 
		int time = d/(s*2); //두 기차가 만나는 시간
		System.out.println(time * t);//두 기차가 만날 때까지 파리의 이동거리
	}
}