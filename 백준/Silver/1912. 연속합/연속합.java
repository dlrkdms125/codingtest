import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int arr[];
    static int dp[];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];
        String line[] = br.readLine().split(" ");

        dp[0] = Integer.parseInt(line[0]);
        int max_val = dp[0];

        for(int i=1; i<n; i++){
            arr[i] = Integer.parseInt(line[i]);
            dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
            max_val = Math.max(max_val, dp[i]);
        }
    
        bw.write(String.valueOf(max_val));
        bw.flush();
        bw.close();
        br.close();
        
    }
}