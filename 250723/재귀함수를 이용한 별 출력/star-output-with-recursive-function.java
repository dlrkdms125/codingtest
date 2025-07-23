import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printstar(n);
    }
    private static void printstar(int n) throws IOException {
        if(n==0) return;
        printstar(n-1);
        
        for(int i=0; i<n; i++){
            bw.write("*");
        }
        bw.newLine();
        bw.flush();
    }

}