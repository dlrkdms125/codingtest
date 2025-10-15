import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[46];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < 46; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        int T = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(arr[T]));
        bw.flush();
        bw.close();
        br.close();
    }
}
