
import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static List<Integer>[] adj;
    static int[] trust;
    static boolean[] vi;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adj = new List[N + 1];
        trust = new int[N + 1];
        vi = new boolean[N + 1];

        // 인접 리스트 초기화
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 시작
            int e = Integer.parseInt(st.nextToken()); // 끝
            adj[s].add(e);
        }

        for (int i = 1; i <= N; i++) {
            Arrays.fill(vi, false); // 방문 배열 초기화
            bfs(i); // 각 노드에서 bfs 수행
        }

        int maxTrust = 0;
        for (int i = 1; i <= N; i++) {
            maxTrust = Math.max(maxTrust, trust[i]);
        }

        for (int i = 1; i <= N; i++) {
            if (trust[i] == maxTrust) bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }

    static void bfs(int start) {
        Queue<Pii> q = new ArrayDeque<>();
        q.add(new Pii(start, 0)); // 시작 노드와 깊이 0
        vi[start] = true;

        while (!q.isEmpty()) {
            Pii poll = q.poll();
            int node = poll.y;
            for (int next : adj[node]) {
                if (!vi[next]) {
                    trust[next]++;
                    vi[next] = true;
                    q.add(new Pii(next, poll.x + 1)); // 다음 노드에 깊이 추가
                }
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
