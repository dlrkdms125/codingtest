import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true){
            if(n%5==0){
                cnt += n/5;
                bw.write(String.valueOf(cnt));
                break;
            } else {
                n -= 2;
                cnt++;
            }
            if(n<0) {
                bw.write("-1");
                bw.flush();
                return;
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}