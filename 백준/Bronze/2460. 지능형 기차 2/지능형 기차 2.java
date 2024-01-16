import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int sum = 0;
		
		for(int i=0; i<10;i++) {
			int N = sc.nextInt(); //내리는사람
			int M = sc.nextInt(); //타는사람
			
			sum = sum -N+M;
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
