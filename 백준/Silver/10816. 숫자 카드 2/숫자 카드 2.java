import java.io.*;
import java.util.*;

public class Main {
    public static int[] solution(int[] cards, int[] queries) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int card : cards) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = map.getOrDefault(queries[i], 0);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] queries = new int[M];
        for (int i = 0; i < M; i++) {
            queries[i] = Integer.parseInt(st.nextToken());
        }
        int[] count = solution(cards, queries);

        StringBuilder sb = new StringBuilder();
        for (int c : count) sb.append(c).append(" ");
        System.out.println(sb);
    }
}
