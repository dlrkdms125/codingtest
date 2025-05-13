import java.io.*;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger[] arr = new BigInteger[10001]; 
        int n = Integer.parseInt(br.readLine());
        arr[0] = BigInteger.valueOf(0);
        arr[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1].add(arr[i - 2]);
        }
        bw.write(String.valueOf(arr[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}