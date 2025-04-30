import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int a = A * (B%10);
        int b = A * ((B%100)/10);
        int c = A * (B/100);

        bw.write(String.valueOf(a));
        bw.newLine();
        bw.write(String.valueOf(b));
        bw.newLine();
        bw.write(String.valueOf(c));
        bw.newLine();
        bw.write(String.valueOf(a+b*10+c*100));
        bw.newLine();
        
        
        bw.flush();
        bw.close();
        br.close();
    }
}