import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf(a+b));
        bw.newLine();
        bw.write(String.valueOf(a-b));
        bw.newLine();
        bw.write(String.valueOf(a*b));
        bw.newLine();
        bw.write(String.valueOf(a/b));
        bw.newLine();
        bw.write(String.valueOf(a%b));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}