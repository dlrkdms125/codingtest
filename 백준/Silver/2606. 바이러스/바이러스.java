import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int n,m;
    static int[][] arr;
    static boolean[] vi;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[n+1][n+1];
        vi = new boolean[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }
        dfs(1);
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
        
    }
    private static void dfs(int start){
        vi[start] = true;
        for(int i=0; i<=n; i++){
            if(arr[start][i]==1 && !vi[i]) {
                cnt++;
                dfs(i);
            }
        }
    }
}