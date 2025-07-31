import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        if(n>=2) dp[2] = 2;
        if(n>=3) dp[3] = 3;
        for(int i=4; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%10007;
        }
        bw.write(String.valueOf(dp[n]));
        bw.flush();

    }
}