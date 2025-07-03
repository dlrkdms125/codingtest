import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sh = Integer.parseInt(st.nextToken());
        int sm = Integer.parseInt(st.nextToken());
        int eh = Integer.parseInt(st.nextToken());
        int em = Integer.parseInt(st.nextToken());

        int end = eh * 60+em;
        int start = sh * 60 +sm;
        bw.write(String.valueOf(end-start));
        bw.flush();

    }
}