import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=n-3; j++){
               int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
               if(sum>max) max = sum;
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}