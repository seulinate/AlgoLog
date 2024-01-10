import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //학교
		int b = sc.nextInt(); //pc
		int c = sc.nextInt(); //학원
		int d = sc.nextInt(); //집
		
		int sum = a+b+c+d;
		int M = sum/60;
		int S = sum %60;
		
		System.out.println(M);
		System.out.println(S);

	}

}
