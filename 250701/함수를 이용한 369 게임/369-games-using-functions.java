import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = determin(a,b);
        bw.write(String.valueOf(result));
        bw.flush();

    }
    private static int determin(int a, int b) throws IOException {
        int count = 0;
        for(int i=a; i<=b; i++){
            if(determin369(i) || i%3==0) count++;
        }
        return count;
    }
    private static boolean determin369(int n) throws IOException {
        String input = String.valueOf(n);
        int count = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='3' || input.charAt(i)=='6' || input.charAt(i)=='9') count++;
        }
        return count>0 ? true: false;
    }
}