import java.lang.*;
import java.io.*;
import java.math.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1; i<=n; i++){
           sum = sum + i;
        }
        bw.write(String.valueOf(sum));
    
        
        bw.flush();
        bw.close();
        // br.close();
    }
}