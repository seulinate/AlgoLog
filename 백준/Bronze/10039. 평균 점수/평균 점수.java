import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0 ;
		//값 입력받아 5개 
		for(int i = 0; i < 5; i++) {
			int score = sc.nextInt();
			
			//40점을 넘는 못하는 경우에 대한 조건 넣기 
			sum += score > 40 ? score : 40;
			
			/*
			  if(val > 40){
			 	sum += val;
			  } else {
			  	sum += 40;
			  }
			  
			*/
		}
		System.out.println(sum/5);
	}
}

