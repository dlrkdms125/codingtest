import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static long n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Long.parseLong(br.readLine());
        bw.write(String.valueOf(recur(n)));
        bw.flush();
    }
    public static long recur(Long n) {
        if(n<=1) return 1;
        return n*recur(n-1);
    }
}