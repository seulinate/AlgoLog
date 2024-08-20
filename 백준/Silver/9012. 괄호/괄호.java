import java.util.*;

class Main{
    public String solution(String str){
        
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        
        for(char x : str.toCharArray()){
            if(x=='('){
                stack.push(x); //x를 스택에 넣어주고
            }else{
                //만약에 스택이 비어있으면 올바른 괄호쌍이 아니니까
                if(stack.isEmpty()) return "NO";
                stack.pop(); //스택 최상단에 있는 여는괄호를 빼줘
            }
        }
        
        //여는괄호가 닫는괄호보다 더 많은 경우도 생각해야하니까 
        if( !stack.isEmpty()) return "NO";
        
       return answer;
   }
   
    public static void main(String[] args){
        Main T = new Main();
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //입력받을 개수 입력
        sc.nextLine(); //이거 안쓰니까 또 틀림ㅡ..ㅡ
        
        for(int i = 0; i < num; i++){
            String str = sc.nextLine(); // 문자열 입력받기
            System.out.println(T.solution(str));
        }
    }
}
