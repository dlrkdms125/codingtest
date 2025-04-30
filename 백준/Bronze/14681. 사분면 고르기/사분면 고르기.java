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

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        // int b = Integer.parseInt(st.nextToken());

        if(x>0 && y>0) bw.write(String.valueOf(1));
        else if (x<0 && y>0) bw.write(String.valueOf(2));
        else if (x<0 && y<0) bw.write(String.valueOf(3));
        else bw.write(String.valueOf(4));
        
        bw.flush();
        bw.close();
        // br.close();
    }
}