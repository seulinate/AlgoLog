import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=s.nextInt();
        int arr[]=new int[n];
        int f[]=new int[num];
        
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=num;j++){
                if(j%arr[i]==0) f[j-1]++;
            }
        }
        int count=0;
        for(int i=0;i<num;i++){
            if(f[i]>0) count++;
        }
        System.out.print(count);
    }
}