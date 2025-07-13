import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] block = new int[n+1];
        for(int i=0; i<n; i++){
            block[i] = 0;
        }
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int j=a; j<=b; j++){
                block[i]++;
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            if(max<block[i]) max = block[i];
        }
    
        bw.write(String.valueOf(max));
        bw.flush();
    }
}