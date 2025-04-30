import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if(m>=45) {
            m -= 45;
        } else {
            if(h==0) {
                h = 23;
                m += 15;
            } else {
                h -= 1;
                m += 15;
            }
        }

        
        bw.write(h+" "+m);
        bw.flush();
        bw.close();
        // br.close();
    }
}