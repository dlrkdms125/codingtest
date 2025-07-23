import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(fibo(n)));
        bw.flush();
        bw.close();
    }
    private static int fibo(int n){
        if(n==1) return 1;
        if(n==2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}