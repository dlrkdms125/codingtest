import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] map = new int[30][30];
        map[0][0] = 1;
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                if(i==j) map[i][j] = i;
            }
            map[i][0] = 1;
        }
        for (int i = 1; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                map[i][j] = map[i-1][j-1]+map[i-1][j];
            }
        }
        bw.write(String.valueOf(map[n-1][k-1]));
        bw.flush();
        bw.close();
        br.close();

    }
}