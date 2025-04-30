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
        int c = Integer.parseInt(br.readLine());
        
        m += c;
        if(m>=60){
             h += m / 60;
            m = m % 60;
        }
         if (h >= 24) {
            h -= 24; // 24시를 넘지 않도록 조정
        }
        
        bw.write(h+" "+m);
        bw.flush();
        bw.close();
        // br.close();
    }
}