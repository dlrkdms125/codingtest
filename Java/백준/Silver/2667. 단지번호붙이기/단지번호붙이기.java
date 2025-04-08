import java.io.*;
import java.util.*;

public class Main {

    static int[][] danji;
    static boolean[][] vi;
    static int[] dx = {0, 0, -1, 1}; 
    static int[] dy = {-1, 1, 0, 0}; 
    static List<Integer> result; 
    static int cnt, N; 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(); 
        result = new ArrayList<>(); 
        N = Integer.parseInt(br.readLine());
        danji = new int[N][N]; 
        vi = new boolean[N][N]; 

     
        for (int i = 0; i < N; i++) {
            sb = new StringBuilder(br.readLine());
            for (int j = 0; j < N; j++) {
                danji[i][j] = sb.charAt(j) - '0'; 
            }
        }

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (danji[x][y] == 1 && !vi[x][y]) { 
                    cnt = 0;
                    dfs(x, y); 
                    result.add(cnt); 
                }
            }
        }

        Collections.sort(result); 

        bw.write(String.valueOf(result.size()));
        bw.newLine();
        for (int num : result) {
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int x, int y) {
        vi[x][y] = true; // 현재 위치 방문 처리
        cnt++; // 현재 단지에 속한 집 개수 증가

        for (int i = 0; i < 4; i++) { 
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !vi[nx][ny] && danji[nx][ny] == 1) {
                dfs(nx, ny); // 연결된 집 발견 시 재귀적으로 탐색 진행
            }
        }
    }
}