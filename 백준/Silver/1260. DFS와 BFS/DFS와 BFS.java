import java.util.*;
import java.io.*;

class Main {
    static boolean[] check;
    static int[][] arr;
    static int node, line, start;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        dfs(start);
        bw.newLine();
        check = new boolean[node + 1];
        bfs(start);
        bw.flush();
        bw.close();
    }

    public static void dfs(int start) throws IOException {
        check[start] = true;
        bw.write(start + " ");
        for (int i = 1; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) dfs(i);
        }
    }

    public static void bfs(int start) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;
        while (!q.isEmpty()) {
            start = q.poll();
            bw.write(start + " ");
            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !check[i]) {
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
