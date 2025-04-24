import java.io.*;

public class Main {

    public static String solution(String board) {
        StringBuilder result = new StringBuilder();
        String[] blocks = board.split("\\.");

        for (int i = 0; i < blocks.length; i++) {
            String block = blocks[i];
            int len = block.length();

            if (len % 2 != 0) {
                return "-1"; // 덮을 수 없음
            }

            // 최대한 AAAA로 덮고 남으면 BB
            int aCount = len / 4;
            int bCount = (len % 4) / 2;

            result.append("AAAA".repeat(aCount));
            result.append("BB".repeat(bCount));

            // 원래 보드에 .이 있었으면 그 위치에 점도 추가
            if (i < blocks.length - 1) {
                result.append(".");
            }
        }

        // 맨 끝이 .로 끝나면 그만큼 붙이기 (split 하면 끝 . 무시되니까)
        int dotCount = 0;
        for (int i = board.length() - 1; i >= 0 && board.charAt(i) == '.'; i--) {
            dotCount++;
        }
        result.append(".".repeat(dotCount));

        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board = br.readLine();
        System.out.println(solution(board));
    }
}
