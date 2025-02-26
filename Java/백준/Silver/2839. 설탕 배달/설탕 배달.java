import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = -1;

        for (int i = n / 5; i >= 0; i--) {
            int remaining = n - (i * 5);

            if (remaining % 3 == 0) {
                count = i + (remaining / 3);
                break;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}