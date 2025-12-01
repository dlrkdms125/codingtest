import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-2; j++){
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                max = Math.max(max, sum);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}