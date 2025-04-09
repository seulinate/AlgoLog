import java.util.*;

public class Main { //백준1251 문제
    public String solution(String str) {
        String answer = null;
        int len = str.length();
        List<String> candidates = new ArrayList<>();

        for (int i = 1; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                String part1 = new StringBuilder(str.substring(0, i)).reverse().toString();
                String part2 = new StringBuilder(str.substring(i, j)).reverse().toString();
                String part3 = new StringBuilder(str.substring(j)).reverse().toString();

                String combined = part1 + part2 + part3;
                candidates.add(combined);
            }
        }

        // 가장 사전순 앞선 문자열 찾기
        Collections.sort(candidates);
        answer = candidates.get(0);

        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); 
        System.out.println(T.solution(text));
    }
}
