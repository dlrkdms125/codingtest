
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[5];
        int count = 0;
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
       while(true){
           n++;
           for (int i = 0; i < 5; i++) {
               if(n>=num[i] && n%num[i]==0) count++;
           }
           if(count>2) break;
           count = 0;
       }
        bw.write(String.valueOf(n));
        bw.flush();
        bw.close();
        br.close();
    }
}