import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int diffBits = N ^ (-N);
        int count = Integer.bitCount(diffBits);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}