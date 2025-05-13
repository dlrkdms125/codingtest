import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigInteger[] arr = new BigInteger[1000001];
        int n = Integer.parseInt(br.readLine());
        BigInteger MOD = BigInteger.valueOf(1000000007);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        
        if(n==0) {
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
            return; // return문이 꼭 필요한가?
        }
        arr[0] = BigInteger.valueOf(0);
        arr[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            BigInteger temp = b;
            b = a.add(b).mod(MOD);
            a = temp;
        }
        
        bw.write(String.valueOf(b));
        bw.flush();
        bw.close();
        br.close();
    }
}