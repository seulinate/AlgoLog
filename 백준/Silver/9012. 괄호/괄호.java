import java.util.*;

class Main {
    public String solution(String str) {
        
        Stack<Character> stack = new Stack<>();
        
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x); // 여는 괄호 스택에 넣고
            } else if (x == ')') {
                // 스택이 비어있으면 올바른 괄호가 아니니가 
                if (stack.isEmpty()) return "NO";
                stack.pop(); // 스택 최상단 여는괄호 빼고 
            }
        }
        
        // 여는 괄호가 더 많은 경우
        if (!stack.isEmpty()) return "NO";
        
        return "YES"; 
    }
    
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 수 입력
        sc.nextLine(); 
        
        for (int i = 0; i < num; i++) {
            String str = sc.nextLine(); 
            System.out.println(T.solution(str)); 
        }
    }
}
