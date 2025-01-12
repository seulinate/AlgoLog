import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 사람의 수 입력
        int N = in.nextInt();

        // 몸무게와 키를 저장할 배열
        int[] weights = new int[N];
        int[] heights = new int[N];

        // 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            weights[i] = in.nextInt(); // 몸무게
            heights[i] = in.nextInt(); // 키
        }

        // 각 사람의 등수를 저장할 배열
        int[] ranks = new int[N];

        // 등수 계산
        for (int i = 0; i < N; i++) {
            int rank = 1; // 기본 등수는 1
            for (int j = 0; j < N; j++) {
                if (i != j) { // 자기 자신은 비교하지 않음
                    // 자신보다 몸무게와 키 모두 큰 사람이 있으면
                    if (weights[j] > weights[i] && heights[j] > heights[i]) {
                        rank++; // 등수 증가
                    }
                }
            }
            ranks[i] = rank; // 계산된 등수를 저장
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(ranks[i] + " ");
        }
    }
}
