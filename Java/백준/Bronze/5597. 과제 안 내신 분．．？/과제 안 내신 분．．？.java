import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] student = new boolean[30];
        for (int i = 0; i < 28; i++) {
            int number = Integer.parseInt(br.readLine());
            student[number-1] = true;
        }
        for (int i = 0; i < 30; i++) {
            if (!student[i]) {
                bw.write(String.valueOf(i+1));
                bw.newLine();
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}