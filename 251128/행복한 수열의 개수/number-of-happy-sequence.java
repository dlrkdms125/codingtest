import java.util.*;
import java.io.*;
  
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int happy = 0;

        // 행 검사
        for(int i=0; i<n; i++){
            int cnt = 1;
            int max = 1;
            for(int j=1; j<n; j++){
                if(arr[i][j]==arr[i][j-1]) cnt++;
                else cnt = 1;
                if(cnt>max) max = cnt;
            }
            if(max>=m) happy++;
        }
        // 열 검사
        for(int j=0; j<n; j++){
            int cnt = 1;
            int max = 1;
            for(int i=1; i<n; i++){
                if(arr[i][j]==arr[i-1][j]) cnt++;
                else cnt = 1;
                if(cnt>max) max = cnt;
            }
            if(max>=m) happy++;
        }
        bw.write(String.valueOf(happy));
        bw.flush();
        bw.close();

    }
}