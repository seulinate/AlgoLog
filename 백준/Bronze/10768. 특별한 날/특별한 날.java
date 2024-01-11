import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); //월 
		int d = sc.nextInt(); //일 
		
		if(m>2) {//당연히 넘는 경우
			System.out.println("After");
		}else if(m<2) {//당연히 안넘는 경우
			System.out.println("Before");
		}else {//special일수있는 경우
			if(d>18) System.out.println("After");
			else if(d<18) System.out.println("Before");
			else System.out.println("Special");
		}
		
	}

}
