import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int a = num / 25;
            num %= 25;

            int b = num / 10;
            num %= 10;

            int c = num / 5;
            num %= 5;

            int d = num;
            bw.write(a + " " + b + " " + c + " " + d + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}