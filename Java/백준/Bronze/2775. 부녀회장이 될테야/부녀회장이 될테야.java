import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] hotels = new int[15][15];

        for (int i = 1; i < 15; i++) {
            hotels[0][i] = i;
        }
        
        for (int k = 1; k < 15; k++) { 
            for (int n = 1; n < 15; n++) { 
                hotels[k][n] = hotels[k - 1][n] + hotels[k][n - 1];
            }
        }
        
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine()); 
            int n = Integer.parseInt(br.readLine()); 
            bw.write(String.valueOf(hotels[k][n]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}