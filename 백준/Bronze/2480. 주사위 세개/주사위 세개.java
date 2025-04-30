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

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());
    
        if(x==y && y==z) bw.write(String.valueOf(10000+x*1000));
        else if ((x==y && y!=z)) bw.write(String.valueOf(1000+100*x));
        else if ((x==z && y!=z)) bw.write(String.valueOf(1000+100*x));
        else if ((y==z && x!=z)) bw.write(String.valueOf(1000+100*y));
        else if (x!=y && y!=z) {
            if(x>y && x>z) bw.write(String.valueOf(x*100));
            else if(y>x && y>z) bw.write(String.valueOf(y*100));
            else if(z>x && z>y) bw.write(String.valueOf(z*100));
            
        }
        
        bw.flush();
        bw.close();
        // br.close();
    }
}