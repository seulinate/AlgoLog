import java.util.*;

public class Main {
    public int[] solution(int N,int[] switches ,int[][] students){
        for(int[] x : students){
            int gender = x[0];
            int switchNumber = x[1];

            if(gender == 1){ //남자
                for(int i = switchNumber; i<=N; i+=switchNumber){ //입력받은 스위치 번호 배수....
                    switches[i] = switches[i] == 0 ? 1 : 0 ;
                }
            }else{ //여자
                switches[switchNumber] = switches[switchNumber] == 0 ? 1 : 0;
                int check = 1;
                while(switchNumber - check >= 1 && switchNumber + check <= N){
                    if(switches[switchNumber - check] == switches[switchNumber + check]){
                        switches[switchNumber - check] = switches[switchNumber -check ] == 0 ? 1:0;
                        switches[switchNumber + check] = switches[switchNumber +check ] == 0 ? 1:0;
                        check ++;
                    }else break;
                }

            }
        }
        return switches;
    }

    public static void main(String[] args){
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] switches = new int[N+1];

        for(int i=1; i<=N; i++){
            switches[i] = sc.nextInt();
        }

        int studentNum = sc.nextInt(); //학생수
        int[][] students = new int[studentNum][2];

        for(int i=0; i<studentNum;i++){
            students[i][0] = sc.nextInt(); //학생 성별 ( 남 : 1 , 여 : 2 )
            students[i][1] = sc.nextInt(); // 학생별 스위치 번호
        }

        int[] result = T.solution(N,switches,students);
        
        for(int i=1; i<=N; i++){
            System.out.print(result[i] + " ");
            if(i % 20 == 0){
                System.out.println();
            }
        }

        sc.close();

    }
}
