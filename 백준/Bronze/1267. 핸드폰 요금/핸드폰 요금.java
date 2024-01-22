import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //지난달 통화한 개수 입력받고
        int N = sc.nextInt(); 
        int M_sum = 0; //민식요금제인경우 가격 
        int Y_sum = 0; //영식요금제인경우
        int sec = 0; //통화한 시간 (초단위)

        // 지난달 통화의 개수
        for (int i = 0; i < N; i++) {
            sec = sc.nextInt(); //위에서 입력받은 통화 개수만큼 시간 입력받고
            Y_sum += ((sec / 30) + 1) * 10; //영식요금제 계산
            M_sum += ((sec / 60) + 1) * 15; //민식요금제 계싼
        }

        if (M_sum == Y_sum) {
            System.out.println("Y M " + Y_sum);
        } else if (M_sum < Y_sum) {
            System.out.println("M " + M_sum);
        } else if (M_sum > Y_sum) {
            System.out.println("Y " + Y_sum);
        }

    }

 }