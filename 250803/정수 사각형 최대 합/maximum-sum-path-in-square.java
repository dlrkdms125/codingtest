import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0]= arr[0][0];
        
        for(int i=1; i<n; i++){
            dp[i][0] = dp[i-1][0]+arr[i][0];
        }
        for(int j=1; j<n; j++){
            dp[0][j] = dp[0][j-1]+arr[0][j];
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+arr[i][j];
            }
        }

        bw.write(String.valueOf(dp[n-1][n-1]));
        bw.flush();

    }
}