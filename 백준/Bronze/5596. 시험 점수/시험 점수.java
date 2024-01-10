import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int S = a+b+c+d;
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int T = A+B+C+D;
		
		if(S>T) {
			System.out.println(S);
		}else if(S<T) {
			System.out.println(T);
		}else {
			System.out.println(S);
		}
	}

}
