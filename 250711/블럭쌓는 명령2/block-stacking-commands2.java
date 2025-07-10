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
        int max = 0;
        for(int i=0; i<k; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            for(int j=a; j<=b; j++){
                block[j]++;
            }
        }
        for(int i=0; i<n; i++){
            if(block[i]>max) max = block[i];
        }

        bw.write(String.valueOf(max));
        bw.flush();
    }
}