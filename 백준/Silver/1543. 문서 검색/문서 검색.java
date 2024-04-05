import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String regex = br.readLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int cnt = 0;

        while(matcher.find()) {
          cnt++;
        }
        bw.write(cnt+"");
        bw.flush(); 
    }
}