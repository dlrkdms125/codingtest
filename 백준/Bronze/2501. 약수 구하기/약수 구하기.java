import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) cnt++;
            if(cnt==k) {
                    bw.write(String.valueOf(i));
                    break;
            }                
        }
        if(cnt<k) bw.write(String.valueOf(0));
        bw.flush();
        
    }
}