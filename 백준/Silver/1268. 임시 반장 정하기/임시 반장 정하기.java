import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생 수 입력
        int numberOfStudents = Integer.parseInt(br.readLine());
        
        // 학생별 1학년 ~ 5학년 반 정보 저장
        int[][] classInfo = new int[numberOfStudents][5];
        for (int student = 0; student < numberOfStudents; student++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int grade = 0; grade < 5; grade++) {
                classInfo[student][grade] = Integer.parseInt(st.nextToken());
            }
        }

        // 두 학생이 서로 같은 반이었던 적이 있는지 기록하는 배열
        boolean[][] hasSharedClass = new boolean[numberOfStudents][numberOfStudents];

        // 같은 반이었던 경우를 찾아서 기록
        for (int grade = 0; grade < 5; grade++) { // 1학년부터 5학년까지
            for (int studentA = 0; studentA < numberOfStudents; studentA++) {
                for (int studentB = studentA + 1; studentB < numberOfStudents; studentB++) {
                    if (classInfo[studentA][grade] == classInfo[studentB][grade]) {
                        hasSharedClass[studentA][studentB] = true;
                        hasSharedClass[studentB][studentA] = true;
                    }
                }
            }
        }

        // 각 학생이 알고 있는 친구 수를 세기
        int[] friendsCount = new int[numberOfStudents];
        for (int studentA = 0; studentA < numberOfStudents; studentA++) {
            for (int studentB = 0; studentB < numberOfStudents; studentB++) {
                if (hasSharedClass[studentA][studentB] && studentA != studentB) {
                    friendsCount[studentA]++;
                }
            }
        }

        // 가장 많은 친구를 가진 학생 찾기
        int mostFriends = -1;
        int leaderStudent = -1;
        for (int student = 0; student < numberOfStudents; student++) {
            if (friendsCount[student] > mostFriends) {
                mostFriends = friendsCount[student];
                leaderStudent = student;
            }
        }

        // 학생 번호는 1번부터 시작하므로 +1 해서 출력
        System.out.println(leaderStudent + 1);
    }
}
