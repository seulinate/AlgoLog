import java.util.*;

class Main {
    public String solution(String str) {
        
        //stringbuilder 사용해야 메모리 초과가 안난다고?!!!!??
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char x : str.toCharArray()) {
            if (x != ' ') { 
                stack.push(x);
            } else {
                while (!stack.isEmpty()) {
                    answer.append(stack.pop());
                }
                answer.append(' ');
            }
        }
        
        // 마지막 단어 처리 (마지막에는 공백이 없으므로)
        while (!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        
        return answer.toString();
    }
    
     public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < num; i++){
            String str = sc.nextLine(); // 문자열 입력받기
            System.out.println(T.solution(str));
        }
    }
}    