import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        bw.write(String.valueOf((A+B)%C));
        bw.newLine();
        bw.write(String.valueOf(((A%C) + (B%C))%C));
        bw.newLine();
        bw.write(String.valueOf((A*B)%C));
        bw.newLine();
        bw.write(String.valueOf(((A%C) * (B%C))%C));
        bw.newLine();
        
        
        bw.flush();
        bw.close();
        br.close();
    }
}