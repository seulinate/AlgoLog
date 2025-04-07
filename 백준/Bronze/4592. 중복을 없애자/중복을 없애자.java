import java.util.Arrays;
import java.util.Scanner;
public class Main {public String solution(String str){
    String answer = "";

    String[] guessNum = str.split(" ");
    String Submitted ="";

    for (String num : guessNum) {
        if(!num.equals(Submitted)) answer +=num+" ";
        Submitted = num;
    }
    answer += "$";
    return answer;
}

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        while (true){
            String str = sc.nextLine();
            if(str.equals("0")) break;

            String[] line = str.split(" ");
            int N = Integer.parseInt(line[0]);
            String guess = "";

            for (int i = 1; i <= N; i++) {
                guess += line[i] + " ";
            }
            guess = guess.trim();
            System.out.println(T.solution(guess));
        }
    }
}