import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(br.readLine());
        // int b = Integer.parseInt(st.nextToken());

        if((a%4==0 && a%100 != 0) || a%400==0) bw.write(String.valueOf(1));
        else bw.write(String.valueOf(0));
        
        bw.flush();
        bw.close();
        // br.close();
    }
}