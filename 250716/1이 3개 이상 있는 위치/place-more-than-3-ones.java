import java.util.*;
import java.io.*;

public class Main {
    // 북동남서
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n+1][n+1];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int x = 0;
        int y = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(inRange(nx, ny) && map[nx][ny]==1) cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();


    }
    private static boolean inRange(int x, int y){
        return (x>=0 && x<n && y>=0 && y<n);
    }

}