import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i=1; i<=n; i++){
            dp[i] = Math.max(dp[i-1]+arr[i-1], arr[i-1]);
        }
        int max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            if(dp[i]>max) max = dp[i];
        }
        bw.write(String.valueOf(max));
        bw.flush();
        
    }
}