import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        
        // 원생들 간의 차이를 저장할 리스트
        List<Integer> diffs = new ArrayList<>();
        
        // 원생들 간의 차이를 계산하여 diffs에 저장
        for (int i = 0; i < N - 1; i++) {
            diffs.add(heights[i + 1] - heights[i]);
        }
        
        // 차이들을 내림차순으로 정렬
        Collections.sort(diffs, Collections.reverseOrder());
        
        // 비용을 계산: 전체 비용에서 가장 큰 K-1개의 차이를 뺀다
        int cost = 0;
        for (int i = 0; i < N - 1; i++) {
            cost += diffs.get(i);
        }
        // 가장 큰 K-1개의 차이를 빼면 나머지 비용이 최소 비용이 된다
        for (int i = 0; i < K - 1; i++) {
            cost -= diffs.get(i);
        }
        System.out.println(cost);
    }
}
