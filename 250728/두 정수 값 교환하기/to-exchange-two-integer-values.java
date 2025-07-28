import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        swap(n,m);
        bw.flush();
    }
    private static void swap(int n, int m) throws IOException {
        int tmp = n;
        n = m;
        m = tmp;
        bw.write(n+" "+m);
    }
}