import java.util.*;

public class Main {
    static int k;
    static char[] signs; // 부등호 배열
    static boolean[] used = new boolean[10]; // 숫자 중복 방지
    static List<String> results = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt(); // 부등호 개수
        signs = new char[k]; 
        
        for (int i = 0; i < k; i++) {
            signs[i] = sc.next().charAt(0); // 부등호 입력
        }

        findNumbers("", 0); // 숫자 조합 찾기

        Collections.sort(results); // 작은 수 → 큰 수 정렬

        System.out.println(results.get(results.size() - 1)); // 최댓값
        System.out.println(results.get(0)); // 최솟값
    }

    static void findNumbers(String num, int depth) {
        if (depth == k + 1) { // k+1자리 숫자가 완성되었을 때
            results.add(num); // 결과 리스트에 추가
            return;
        }

        for (int i = 0; i < 10; i++) { // 0~9 숫자 선택
            if (!used[i]) { // 중복 방지
                if (depth == 0 || isValid(num.charAt(depth - 1) - '0', i, signs[depth - 1])) {
                    used[i] = true; // 숫자 사용 표시
                    findNumbers(num + i, depth + 1); // 다음 숫자 찾기
                    used[i] = false; // 백트래킹 (되돌아가기)
                }
            }
        }
    }

    static boolean isValid(int prev, int next, char sign) {
        if (sign == '<') return prev < next; // 부등호가 < 일 때
        return prev > next; // 부등호가 > 일 때
    }
}
