import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
    
   
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
        
        while (true) {
            st = new StringTokenizer(br.readLine());
             int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            //int N = sc.nextInt(); 
            //int M = sc.nextInt(); 
            if (N == 0 && M == 0) break;

            int[] sang = new int[N];
            for (int i = 0; i < N; i++) {
                //sang[i] = sc.nextInt();
                sang[i] = Integer.parseInt(br.readLine());
            }
            int count = 0;
            for (int i = 0; i < M; i++) {
                //int cd = sc.nextInt();
                int cd = Integer.parseInt(br.readLine());
                if (binarySearch(sang, cd)) count++;
            }
            System.out.println(count);
        }
    }
}
