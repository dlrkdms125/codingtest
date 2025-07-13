import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
    
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cnt = 0;
                for(int d=0; d<4; d++){
                    int nx = i+dx[d];
                    int ny = j+dy[d];
                    if(inRange(nx, ny) && map[nx][ny]==1) cnt++;
                }
                if(cnt>=3) result++;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static boolean inRange(int x, int y){
        boolean answer = false;
        if(x>=0 && x<n && y>=0 && y<n) answer = true;
        else answer = false;
        return answer;
    }
}