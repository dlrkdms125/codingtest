import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i=0; i<10; i++){
           h.add(Integer.parseInt(br.readLine())%42);
        }
    
        bw.write(String.valueOf(h.size()));
        bw.flush();
        bw.close();
    
    }
}