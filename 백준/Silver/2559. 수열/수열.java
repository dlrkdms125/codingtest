import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        int currentSum = 0;

        for(int i=0; i<k; i++){
            currentSum += arr[i];
        }
        maxSum = currentSum;

        for(int i=k; i<n; i++){
            currentSum = currentSum - arr[i-k]+arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        bw.write(String.valueOf(maxSum));
        bw.close();
        br.close();
    }
}