import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] num = new long[91]; 

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= n; i++) { 
            num[i] = num[i - 1] + num[i - 2];
        }

        bw.write(num[n] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}