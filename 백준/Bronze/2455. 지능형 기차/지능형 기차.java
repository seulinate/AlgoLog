import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int max = 0; //최대 인원수 
		int sum = 0; //정거장 당 인원수 
		
		for(int i=0; i<4; i++) {
			int N = sc.nextInt(); //내린 사람
			int M = sc.nextInt(); //탄 사람
			
			sum = sum +M-N;
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}

}
