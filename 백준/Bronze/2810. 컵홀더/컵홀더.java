import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());  
        String seats = br.readLine();   
        
        int coupleCount = 0;

        for (int i = 0; i < seats.length() - 1; i++) {
            if (seats.charAt(i) == 'L' && seats.charAt(i + 1) == 'L') {
                coupleCount++;
                i++;
            }
        }
        int cupHolders = N - coupleCount + 1;
        System.out.println(Math.min(N, cupHolders));
    }
}
