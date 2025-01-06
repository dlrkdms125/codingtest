import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static char[][] m;
    static boolean[][] vi;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        m = new char[N][M];
        vi = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            m[i] = br.readLine().toCharArray();
        }

        int wSum = 0;
        int bSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (vi[i][j]) continue;
                if (m[i][j] == 'W') wSum += bfs(i, j);
                else bSum += bfs(i, j);
            }
        }

        bw.write(wSum + " " + bSum);
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int sty, int stx) {
        Queue<Pii> q = new ArrayDeque<>();
        q.add(new Pii(sty, stx));
        vi[sty][stx] = true;

        int ret = 1; // Start with size of one cell
        while (!q.isEmpty()) {
            Pii poll = q.poll();
            int cy = poll.y;
            int cx = poll.x;

            for (int i = 0; i < 4; i++) {
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M || vi[ny][nx] || m[ny][nx] != m[sty][stx]) continue;

                q.add(new Pii(ny, nx));
                vi[ny][nx] = true;
                ret++;
            }
        }
        return ret * ret; 
    }

    static class Pii {
        int y, x;

        public Pii(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
