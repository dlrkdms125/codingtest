import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        String c = input.substring(n-1,n);
        bw.write(c);
        bw.flush();
        bw.close();
    
    }
}