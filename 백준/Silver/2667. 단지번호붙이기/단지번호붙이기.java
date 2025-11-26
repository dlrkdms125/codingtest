import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static int n;
    static int[][] arr;
    static boolean[][] vi;
    static int cnt;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        vi = new boolean[n][n];
        
        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<n; j++){
                arr[i][j] = line.charAt(j)-'0';
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        // 전체 지도 탐색
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]==1 && !vi[i][j]) {
                    cnt = 0;
                    dfs(i,j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        bw.write(String.valueOf(list.size()));
        bw.newLine();
        for(int num: list){
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
    private static void dfs(int x, int y){
        vi[x][y] = true;
        cnt++;
        for(int d=0; d<4; d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
            if(!vi[nx][ny] && arr[nx][ny]==1) dfs(nx, ny);
        }
    }
}