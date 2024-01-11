import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int date = sc.nextInt(); //날짜의 일의자리 숫자
		int cnt = 0;
		
		//5대의 일의자리 숫자 입력 
		int[] num = new int[5];
		
		//자동차 일의자리 숫자 5개 입력받는 배열
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			if(date == num[i]) cnt+=1;
		}
		System.out.println(cnt);

	}

}
