import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(sum(n)));
        bw.flush();
    }
    private static int sum(int n) throws IOException {
        if(n==1) return 1;
        if(n==2) return 2;
        return sum(n-2)+n;
    }
}