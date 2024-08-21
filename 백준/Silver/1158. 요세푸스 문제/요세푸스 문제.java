import java.util.*;

class Main {
    public String solution(int n, int k) {
        StringBuilder result = new StringBuilder(); //어제 사용했던 builder 사용해버릇
        Queue<Integer> Q = new LinkedList<>();
        
        for (int i = 1; i <= n; i++) {
            Q.offer(i);  // 큐에 1-n 입력값 숫자 넣기 
        }
        
        result.append("<");
        
        while (!Q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());  //큐의 맨 뒤로 보내고
            }
            result.append(Q.poll());  // K번째 사람을 제거 - 결과값에 추가시키고
            if (!Q.isEmpty()) {
                result.append(", ");
            }
        }
        
        result.append(">");
        return result.toString();
        
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        
        int n = kb.nextInt();
        int k = kb.nextInt();
        
        System.out.println(T.solution(n, k)); 
    }
}
