import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4]; //4개의 정수 입력받을거임
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt(); //for문으로 4개 정수 입력받음 
		}
        
		Arrays.sort(arr); //순서대로 정렬하고 
		System.out.println(arr[0] * arr[2]); 
		
	}

}