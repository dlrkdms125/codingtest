import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int find = Integer.parseInt(br.readLine());

        // 반시계 뱡향
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int x = 0, y=0, dir=0, num=n*n;
        int fx = 0, fy=0;

        for (int i = 0; i < n * n; i++) {
            arr[x][y] = num;
            if (num == find) {
                fx = x + 1; 
                fy = y + 1;
            }
            num--;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (0 <= nx && nx < n && 0 <= ny && ny < n && arr[nx][ny] == 0) {
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4;
                x += dx[dir];
                y += dy[dir];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.newLine();
        }
        // 찾는 숫자의 좌표 출력
        bw.write(fx + " " + fy);

        bw.flush();
        bw.close();
        br.close();

    }
}