import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 2;
        
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1]*2+dp[i-2]*3)%1000000007;
            for(int j=i-3; j>=0; j--){
                dp[i] = (dp[i]+dp[j]*2)%1000000007;
            }
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();

    }
}