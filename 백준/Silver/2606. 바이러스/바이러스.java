import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][] map;
    static boolean[] vi;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        vi = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;

        }
        dfs(1);
        bw.write(String.valueOf(count-1));
        bw.flush();
        bw.close();
        br.close();

    }
    private static void dfs(int v) {
        vi[v] = true;
        count++;
        for (int i = 1; i <= n; i++) {
            if(map[v][i] == 1 && !vi[i]){
                dfs(i);
            }
        }
    }
}