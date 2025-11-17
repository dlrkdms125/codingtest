import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean vi[];
    static int arr[];
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        vi = new boolean[n];
        dfs(n,m,0);
        bw.flush();
            
    }
    public static void dfs(int n, int m, int depth) throws IOException {
        if(depth==m) {
            for(int i=0; i<m; i++) bw.write(arr[i]+" ");
            bw.newLine();
            return;
        }
        for(int i=0; i<n; i++){
            if(!vi[i]) {
                vi[i] = true;
                arr[depth] = i+1;
                dfs(n,m,depth+1);
                vi[i] = false;
            }
        }
    }
}