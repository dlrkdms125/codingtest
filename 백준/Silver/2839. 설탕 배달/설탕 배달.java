import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        Arrays.fill(dp,-1);
        dp[0] = 0;

        for(int i=1; i<=n; i++){
            if(i>=3 && dp[i-3]!=-1){
                dp[i] = dp[i-3]+1;
            }
            if(i>=5 && dp[i-5]!=-1){
                if(dp[i]==-1 || dp[i]>dp[i-5]+1){
                    dp[i] = dp[i-5]+1;
                }
            }
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
        br.close();
  
    }
}