import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 정수 A 입력 받기
        int A = scanner.nextInt();
        
        // 두 번째 정수 B 입력 받기
        int B = scanner.nextInt();
        
        // A와 B의 합을 출력
        System.out.println(A + B);
        
        scanner.close();
    }
}
