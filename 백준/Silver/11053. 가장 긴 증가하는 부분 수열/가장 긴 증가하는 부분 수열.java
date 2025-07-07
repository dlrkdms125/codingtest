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
        Arrays.fill(dp, 1);

        int max = 1;
        for(int i=1; i<n; i++){
            int maxDp = 0;
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]) maxDp = Math.max(maxDp, dp[j]);
            }
            dp[i] = maxDp +1;
            max = Math.max(max, dp[i]);
        }
    
        bw.write(String.valueOf(max));
        bw.flush();
        
    }
}