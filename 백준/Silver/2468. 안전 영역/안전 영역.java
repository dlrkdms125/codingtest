import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[][] arr;
    static boolean[][] check;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        
        arr = new int[n][n];
        check = new boolean[n][n];
        int maxheight = 0;
        
        // 최대 높이 찾아냄
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                maxheight = Math.max(arr[i][j], maxheight);
            }
        }
        
        int max = 0;
        
        // 높이마다 안전 영역의 개수를 계산
        for(int height=0; height<=maxheight; height++){
            // 높이마다 check 배열 초기화
            check = new boolean[n][n];
            int count = 0;
            
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    // 방문하지 않았고, 높이보다 크다면
                    if(!check[i][j] && arr[i][j]>height) {
                        count++;
                        dfs(i,j,height);
                    }
                }
            }
            // 가장 큰 안전 영역 개수 업데이트
            max = Math.max(max, count);
        }
        
        bw.write(String.valueOf(max));
        bw.close();
    }
    
    // dfs 함수는 void로 수정, 반환값 없음
    static void dfs(int x, int y, int height){
        check[x][y] = true;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
            if(check[nx][ny]) continue;
            if(arr[nx][ny] > height) {
                dfs(nx, ny, height);
            }
        }
    }
}
