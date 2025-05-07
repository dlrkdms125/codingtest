import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
            
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 하나의 for문으로 a,b를 채울순 없나?
        int[][] c = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                c[i][j] = a[i][j]+b[i][j];
                bw.write(String.valueOf(c[i][j]+" "));
                
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}