import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        boolean isGood = true;
        int badP = -1;

        // 2부터 l-1까지 소수만 체크해서 k와 나누어 떨어지는지 확인
        for (int i = 2; i < l; i++) {
            if (isPrime(i)) {
                if (k.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    isGood = false;
                    badP = i;
                    break;
                }
            }
        }

        if (isGood) {
            bw.write("GOOD\n");
        } else {
            bw.write("BAD " + badP + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 소수 판별 함수
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}