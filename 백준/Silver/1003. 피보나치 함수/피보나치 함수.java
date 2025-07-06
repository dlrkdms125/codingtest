import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[][] dp = new int[42][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i=2; i<=40; i++){
           dp[i][0] = dp[i-1][0] + dp[i-2][0];
           dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
        for(int i=0; i<t; i++){
            bw.write(dp[arr[i]][0]+" "+dp[arr[i]][1]);
            bw.newLine();
        }

        bw.flush();  
    }
}