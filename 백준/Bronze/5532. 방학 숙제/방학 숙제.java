import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); //방학일수 10
		int a = sc.nextInt(); //국어숙제 32 
		int b = sc.nextInt(); //수학숙제 48 
		int c = sc.nextInt(); //국어 최대 sol 4
		int d = sc.nextInt(); //수학 최대 sol 6
		sc.close();
		
		//놀수 있는 날 ? 
		int kor = 0;
		if(a%c == 0) { 
			kor = L - (a/c); //15-8 = 7
		}else { //나머지가 있는경우 하루 더 숙제해야하니까 +1 
			kor = L-((a/c) + 1); 
		}
		
		int math = 0;
		if(b%d == 0) {
			math = L - (b/d);
		}else {
			math = L - ((b/d) + 1); // 15-8 = 7
		}
	
		System.out.println(Math.min(kor,math)); // 7 
		
	}
}
