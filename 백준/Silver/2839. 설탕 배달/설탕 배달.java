import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        if(n >= 3) dp[3] = 1;
        if(n >= 5) dp[5] = 1;
        for(int i = 6; i <= n; i++) {
            if(dp[i-3] != 0) dp[i] = dp[i-3] + 1;
            if(dp[i-5] != 0) {
                if(dp[i] == 0 || dp[i-5] + 1 < dp[i]) {
                    dp[i] = dp[i-5] + 1;
                }
            }
        }
        if(dp[n] == 0) bw.write("-1");
        else bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}
