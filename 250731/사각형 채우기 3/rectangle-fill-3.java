import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 2;
        if(n>=2) dp[2] = 7;
        if(n>=2)dp[3] = 22;
        for(int i=4; i<=n; i++){
            dp[i] = (dp[i-1]*2+dp[i-2])%1_000_000_007;
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();

    }
}