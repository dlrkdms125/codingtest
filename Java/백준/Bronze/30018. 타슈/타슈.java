import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] != b[i]) {
                if(a[i]>b[i]) count += a[i]-b[i];
                else count += b[i]-a[i];
            }
        }
        bw.write(String.valueOf(count/2));
        bw.flush();
        bw.close();
        br.close();

    }
}