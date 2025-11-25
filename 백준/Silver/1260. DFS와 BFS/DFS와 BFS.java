import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int[][] arr;
    static boolean[] vi;
    static int node, line, start;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new int[node+1][node+1];
        vi = new boolean[node+1];
        for(int i=0; i<line; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] =1;
        }
        dfs(start);
        sb.append("\n");
        vi = new boolean[node+1];
        bfs(start);
    
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    public static void dfs(int start){
        vi[start] = true;
        sb.append(start+" ");
        for(int i=0; i<=node; i++){
            if(arr[start][i]==1 && !vi[i]) dfs(i);
        }
    }
    public static void bfs(int start){
        q.add(start);
        vi[start] = true;
        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start+" ");
            for(int i=1; i<=node; i++){
                if(arr[start][i]==1 && !vi[i]){
                    q.add(i);
                    vi[i] = true;
                }
            }
        }
    }
}