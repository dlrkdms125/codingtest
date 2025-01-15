import java.util.*;
import java.io.*;

public class Main {
    static int N, M, K;
    static int[][] m; 
    static boolean[][] vi;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); 
            N = Integer.parseInt(st.nextToken()); 
            K = Integer.parseInt(st.nextToken());

            m = new int[N][M];
            vi = new boolean[N][M];

            // 배추 위치 입력
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                m[y][x] = 1; 
            }

            int count = 0; // 벌레 수
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (m[i][j] == 1 && !vi[i][j]) { // 배추가 있고 방문하지 않은 경우
                        bfs(i, j); // 연결된 영역 탐색
                        count++;
                    }
                }
            }

            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int startY, int startX) {
        Queue<Pii> queue = new ArrayDeque<>();
        queue.add(new Pii(startY, startX));
        vi[startY][startX] = true;

        while (!queue.isEmpty()) {
            Pii current = queue.poll();
            int cy = current.y;
            int cx = current.x;

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M) continue; 
                if (vi[ny][nx] || m[ny][nx] == 0) continue; 

                queue.add(new Pii(ny, nx));
                vi[ny][nx] = true;
            }
        }
    }

    static class Pii {
        int y, x;
        public Pii(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
