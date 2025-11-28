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
        int max = -100000;
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=n-3; j++){
                int cnt = 0;
                for(int d1=i; d1<i+3; d1++){
                    for(int d2=j; d2<j+3; d2++){
                        if(arr[d1][d2]==1) cnt++;
                    }
                }
                if(cnt>max) max = cnt;
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();

    }
}