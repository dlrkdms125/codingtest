import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        String maxA = A.replace('5', '6');
        String maxB = B.replace('5', '6');

        String minA = A.replace('6', '5');
        String minB = B.replace('6', '5');

        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}