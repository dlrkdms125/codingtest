import java.io.*;

public class Main {
    static int N, M, K;
    static char[][] m = new char[10][10];
    static boolean[][] vi = new boolean[10][10];
    static int[] res = new int[30];
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void dfs(int cd, int cy, int cx) {
    // 재귀로 구현할때, 도착지점 있어야 한다
        if (cy == 0 && cx == M - 1) {
            res[cd]++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nd = cd + 1;
            int ny = cy + dy[i];
            int nx = cx + dx[i];
            if (ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
            if (vi[ny][nx] || m[ny][nx] == 'T') continue;
            vi[ny][nx] = true;
            dfs(nd, ny, nx);
            vi[ny][nx] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                m[i][j] = str.charAt(j);
            }
        }

        vi[N - 1][0] = true;
        dfs(1, N - 1, 0);
        bw.write(String.valueOf(res[K]));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
