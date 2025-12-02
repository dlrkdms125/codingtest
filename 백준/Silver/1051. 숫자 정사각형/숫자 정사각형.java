import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String[] line = st.nextToken().split("");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        int max = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                for(int size=1; i+size<n && j+size<m; size++){
                    int x = i+size;
                    int y = j+size;
                    if(arr[i][j]==arr[i][y] && arr[i][j]==arr[x][j] && arr[i][j]==arr[x][y]) max = Math.max(max, (size+1)*(size+1));
                }
            }
        }
    
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }
}