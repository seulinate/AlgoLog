import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N을 입력받고
		sc.close(); //이거 매번 까먹음 작성하는 습관 들이기!! 
        
		//구구단 출력해야함 for문 이용
		int i=0;
        for(i=1; i<10; i++){
			System.out.println(N+" * "+i+" = "+(N*i));
	}
	}
}