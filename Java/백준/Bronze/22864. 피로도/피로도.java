import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int count = 0, p = 0, answer = 0;
        while (count != 24) {
            if (p + a <= m) {
                answer += b;
                p += a;
            } else {
                p = p - c < 0 ? 0 : p - c;
            }
            count++;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
