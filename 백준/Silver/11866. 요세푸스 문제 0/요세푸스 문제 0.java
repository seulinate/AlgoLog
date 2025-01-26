import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 처리
        int n = scanner.nextInt(); // 사람의 수
        int k = scanner.nextInt(); // 제거할 순번
        scanner.close();

        // Queue를 사용하여 사람들을 관리
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();
        result.append("<");

        // 요세푸스 순열 계산
        while (!queue.isEmpty()) {
            // K-1번 앞으로 이동
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll()); // 맨 앞의 요소를 맨 뒤로 이동
            }

            // K번째 사람 제거
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", "); // 마지막 요소가 아닐 경우 쉼표 추가
            }
        }

        result.append(">");
        System.out.println(result);
    }
}
