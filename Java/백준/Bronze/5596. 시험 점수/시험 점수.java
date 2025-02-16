import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum1 = 0;
        for (int i = 0; i < 4; i++) {
            sum1 += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int sum2 = 0;
        for (int i = 0; i < 4; i++) {
            sum2 += Integer.parseInt(st.nextToken());
        }
        if(sum1>sum2) bw.write(String.valueOf(sum1));
        else bw.write(String.valueOf(sum2));

        bw.flush();
        bw.close();
        br.close();

    }
}
