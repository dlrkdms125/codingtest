import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 2;
        dp[2] = 7;
        dp[3] = 22;
        for(int i=4; i<=n; i++){
            dp[n] = (dp[n-1]*4-dp[n-1]+1);
        }

        bw.write(String.valueOf(dp[n]%1_000_000_007));
        bw.flush();

    }
}