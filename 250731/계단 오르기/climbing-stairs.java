import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        if(n>=2) dp[2] = 1;
        if(n>=3) dp[3] = 1;
        if(n>=4) dp[4] = 1;
        if(n>=5) dp[5] = 2;
        for(int i=6; i<=n; i++){
            dp[i] = dp[i-2]+dp[i-3];
        }
        bw.write(String.valueOf(dp[n]%10007));
        bw.flush();
    }
}