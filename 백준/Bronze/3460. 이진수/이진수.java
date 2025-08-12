import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int pos = 0;
            while(n>0){
                if((n&1)==1) sb.append(pos).append(' ');
                n >>= 1;
                pos++;
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
        
    }
}