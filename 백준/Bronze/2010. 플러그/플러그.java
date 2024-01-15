import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); //N개 입력받고 
		//플래그를 꽂을 자리 수의 총 합을 나타내는 변수. 처음에 1개이기 때문에 1저장
		int total = 1;
		//입력한 값을 sum에 더하기
		for(int i = 0; i < N; i++) {
			total += Integer.parseInt(br.readLine());
		}
		//멀티탭이 사용한 자리는 한번 낄때마다 하나씩 사용하기에 반복 횟수만큼 -1해주면 되니 N을 빼주기
		total -= N;
		System.out.println(total);
	}
}