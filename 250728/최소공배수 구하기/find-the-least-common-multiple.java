import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = gcd(n, m);
        bw.write(String.valueOf(n*m/result));
        bw.flush();
    }
    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
