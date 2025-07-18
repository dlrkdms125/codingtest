import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;
        
        min = Math.min(min, Math.abs(b-a));
        min = Math.min(min, Math.abs(x-a)+Math.abs(b-y));
        min = Math.min(min, Math.abs(y-a)+Math.abs(b-x));
        
        bw.write(String.valueOf(min));
        bw.flush();
    }
}