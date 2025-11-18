import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] dp = new int[12];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=11; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(int i=0; i<t; i++){
            int number = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[number]));
            bw.newLine();
        }
        bw.flush();       
    }
}