import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int sum = A+B+C+D;
        int h = sum / 60;
        int m = sum % 60;

        bw.write(String.valueOf(h));
        bw.newLine();
        bw.write(String.valueOf(m));

        bw.flush();
        bw.close();
        br.close();

    }
}