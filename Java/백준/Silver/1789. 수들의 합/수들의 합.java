import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());
        int k = 1;
        while ((long) k * (k + 1) / 2 <= n) {
            k++;
        }

        bw.write(String.valueOf(k-1));
        bw.flush();
        bw.close();
        br.close();

    }
}