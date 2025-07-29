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
        int result = 0;
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=n-3; j++){
                int sum = 0;
                for(int x=i; x<i+3; x++){
                    for(int y=j; y<j+3; y++){
                        if(arr[x][y]==1) sum++;
                    }
                }
                if(sum>result) result = sum;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();

    }
}