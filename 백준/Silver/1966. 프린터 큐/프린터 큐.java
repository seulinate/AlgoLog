import java.util.*;

class Main {
    public int solution(int n, int m, int[] priorities) {
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new int[] {i, priorities[i]});
        }
        
        int printOrder = 0;  // 현재 인쇄 순서
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;
            
            // 나머지 문서들 중에 현재 문서보다 중요도가 높은 문서가 있는지 체크
            for (int[] doc : queue) {
                if (doc[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }
            
            if (hasHigherPriority) {// 현재 문서보다 중요도가 높은 문서가 있는경우 현재 문서를 뒤로 보내고 
                queue.offer(current);
            } else {// 현재 문서
                printOrder++;
                if (current[0] == m) {
                    return printOrder;
                }
            }
        }
        
        return -1;  // 이 부분은 실제로는 도달하지 않음
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            int m = scanner.nextInt();
            int[] priorities = new int[n];
            
            for (int j = 0; j < n; j++) {
                priorities[j] = scanner.nextInt();
            }
            System.out.println(T.solution(n, m, priorities));
        }
    }
}
