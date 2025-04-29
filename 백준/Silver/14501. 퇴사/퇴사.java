import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n+1];
        int[] p = new int[n+1];
        int[] dp = new int[n+2];
        
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine(), " ");
           t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;
    
        for(int i=n; i>0; i--){
            int next = i+t[i]; // 다음 날짜
            if(next>n+1){ // 일할 수 있는 날짜 넘어가면
                dp[i] = dp[i+1]; // 일을 하지 못하므로 바로 다음 dp값로 설정
            } else {
                // 일하지 않았을 때 dp[i+1]
                // 일했을때 총 벌수 있는 금액 p[i]+dp[next]
                dp[i] = Math.max(dp[i+1], p[i]+dp[next]);
            }
            
        }
        bw.write(String.valueOf(dp[1]));
        bw.flush();
        bw.close();
        br.close();
    
    }
    
}