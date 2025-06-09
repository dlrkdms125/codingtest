import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][] map;
    static boolean[][] vi;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        vi = new boolean[n][m];
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==1 && !vi[i][j]){ // 1이면서 방문하지 않은 곳
                    cnt++;
                    max = Math.max(max, bfs(i,j));
                }
            }
        }
        bw.write(cnt+"\n"+max);
        bw.close();
        br.close();

    }
    static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        vi[x][y] = true;
        int size = 1;
        while(!q.isEmpty()){
            int[] cur = q.poll();
            for(int d=0; d<4; d++){
                int nx = cur[0]+dx[d];
                int ny = cur[1]+dy[d];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !vi[nx][ny] && map[nx][ny]==1){
                    vi[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                    size++;
                }
            }
        }
        return size;
    }
}