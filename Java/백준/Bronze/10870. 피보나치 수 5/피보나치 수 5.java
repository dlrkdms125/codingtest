import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[45];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++){
            arr[i] = arr[i-2]+arr[i-1];
        }
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
        br.close();

    }
}