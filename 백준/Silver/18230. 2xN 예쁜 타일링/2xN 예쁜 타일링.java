import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문제의 input을 받습니다.
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        // 2. arr1(2x1 타일)을 입력받고 정렬
        for (int i = 0; i < A; i++) {
            arr1.add(sc.nextInt());
        }
        
        // 2. arr2(2x2 타일)을 입력받고 정렬
        for (int i = 0; i < B; i++) {
            arr2.add(sc.nextInt());
        }

        // 3. 각 배열을 내림차순으로 정렬
        Collections.sort(arr1, Collections.reverseOrder());
        Collections.sort(arr2, Collections.reverseOrder());
        
        int ans = 0;

        // 4. N이 홀수일 경우 2x1 타일 중 가장 큰 값을 사용
        if (N % 2 == 1) {
            ans += arr1.get(0);
            arr1.remove(0);
            N--;
        }

        // 5. 2x2 타일과 2x1 타일을 조합해 채워 나가며 탐색
        for (int i = 0; i < N / 2; i++) {
            int case1 = 0, case2 = 0;

            if (arr1.size() >= 2) {
                case1 = arr1.get(0) + arr1.get(1); // 2x1 타일 2개
            }

            if (arr2.size() >= 1) {
                case2 = arr2.get(0); // 2x2 타일 1개
            }

            if (case1 > case2) {
                ans += case1;
                arr1.remove(0); // 2x1 타일 두 개를 사용
                arr1.remove(0);
            } else {
                ans += case2;
                arr2.remove(0); // 2x2 타일 한 개 사용
            }
        }

        // 6. 결과 출력
        System.out.println(ans);
    }
}
