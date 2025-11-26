import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        print(n);
        bw.flush();

    }
    private static void print(int n) throws IOException {
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<4; j++){
                cnt++;
                if(cnt>9) cnt = 1;
                bw.write(String.valueOf(cnt)+" ");
            }
            bw.newLine();
        }
    }
}