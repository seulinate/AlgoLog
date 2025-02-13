import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Map<Integer, Integer> candidateHeap = new HashMap<>();
        Queue<Integer> orderQueue = new LinkedList<>();

        for (int x : arr) {
            if (candidateHeap.containsKey(x)) {
                candidateHeap.put(x, candidateHeap.get(x) + 1);
            } else {
                if (candidateHeap.size() >= N) {
                    int minValue = Collections.min(candidateHeap.values());
                    int delKey = -1;
                    for (int key : orderQueue) {
                        if (candidateHeap.get(key) == minValue) {
                            delKey = key;
                            break;
                        }
                    }
                    candidateHeap.remove(delKey);
                    orderQueue.remove(delKey);
                }
                candidateHeap.put(x, 1);
                orderQueue.add(x);
            }
        }

        List<Integer> result = new ArrayList<>(candidateHeap.keySet());
        Collections.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}