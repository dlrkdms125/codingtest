import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = count(n);
        bw.write(String.valueOf(result));
        bw.flush();
    }
    private static int count(int n){
        if(n==1) return 0;
        if(n%2==0) {
            return count(n/2)+1;
        } else {
            return count(n*3+1)+1;
        }    
    }
}