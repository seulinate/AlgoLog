import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9]; //9개의 숫자를 입력받아
		int max = arr[0]; // 최대값 담을 변수 max
		int index = 0 ; //최대값 위치 담는 변수
		
		//arr의 길이만큼 입력을 반복한다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
				index = i+1;
				
			}
		}
		
		System.out.println(max);
		System.out.println(index);

	}

}