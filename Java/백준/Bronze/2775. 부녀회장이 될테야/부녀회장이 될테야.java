import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] APT = new int[15][15];

        for (int i = 1; i < 15; i++) {
            APT[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if (j == 1) {
                    APT[i][j] = 1;
                } else {
                    APT[i][j] = APT[i - 1][j] + APT[i][j - 1];
                }
            }
        }

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            bw.write(APT[k][n] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

