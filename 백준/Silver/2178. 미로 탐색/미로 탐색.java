import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static boolean[][] check;
    static int[][] map;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        check = new boolean[n][m]; 
        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<m; j++){
                map[i][j] = s.charAt(j)-'0';
            }
        }
        check[0][0] = true;
        bfs(0,0);
        bw.write(String.valueOf(map[n-1][m-1]));
        bw.flush();
        bw.close();
        br.close();
    }
    public static void bfs(int x, int y){
        ArrayDeque<Spot> q = new ArrayDeque<>();
        q.add(new Spot(x,y));
        while(!q.isEmpty()){
            Spot s = q.poll();
            for(int i=0; i<4; i++){
                int nextX = s.x+dx[i];
                int nextY = s.y+dy[i];
                if(nextX<0 || nextX>=n || nextY>=m || nextY<0) continue;
                // 이미 체크했거나 숫자가 0이라면
                if(check[nextX][nextY] || map[nextX][nextY]==0) continue;
                q.add(new Spot(nextX, nextY));
                map[nextX][nextY] = map[s.x][s.y]+1;
                check[nextX][nextY] = true;
        }
    }
}
    static class Spot {
        int x;
        int y;
        Spot(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
}