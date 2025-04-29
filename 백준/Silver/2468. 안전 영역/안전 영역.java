import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int[][] map;
    static boolean[][] check;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int n, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        check = new boolean[n][n];
        int maxHeight = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]>maxHeight) maxHeight = map[i][j];
            }
        }
        int max = 0;
        // maxHeight 만큼 돌면서, 각각 안전영역이 몇개인지 체크하고, 가장 많은 안전 영역을 반환한다.
        for(int height=0; height<=maxHeight; height++){
            check = new boolean[n][n];
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(!check[i][j] && map[i][j]>height){
                        count++;
                        dfs(i,j,height);
                    }
                }
            }
            max = Math.max(max, count);
        }
        bw.write(String.valueOf(max));
        bw.close();
        

        
    }
    public static void dfs(int x, int y,int height){
        check[x][y] = true;
        for(int i=0; i<4; i++){
            int nx = x +dx[i];
            int ny = y +dy[i];
            if(nx<0 || ny<0 || nx>=n || ny>=n || check[nx][ny]) continue;
            if(map[nx][ny] > height) dfs(nx, ny, height);
        }
    }
}