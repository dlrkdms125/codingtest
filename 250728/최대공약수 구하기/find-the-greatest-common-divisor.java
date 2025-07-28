import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = gcd(n,m);
        bw.write(result+"\n");
        bw.flush();
    }
    private static int gcd(int a, int b) throws IOException {
        if(b==0) return a;
        return gcd(b, a%b);
    }
}