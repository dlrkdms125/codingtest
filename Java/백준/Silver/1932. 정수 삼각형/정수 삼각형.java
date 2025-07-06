import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[n][n];
        dp[0][0] = map[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) { 
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + map[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + map[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + map[i][j];
                }
            }
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            for (int j = 0; j <n; j++) {
                if (dp[i][j] > max) max = dp[i][j];
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();


    }
}