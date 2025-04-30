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

        if(a>=90 && a<=100) bw.write("A");
        else if (a>=80 && a<=89) bw.write("B");
        else if (a>=70 && a<=79) bw.write("C");
        else if (a>=60 && a<=69) bw.write("D");
        else bw.write("F");
    
        bw.flush();
        bw.close();
        // br.close();
    }
}