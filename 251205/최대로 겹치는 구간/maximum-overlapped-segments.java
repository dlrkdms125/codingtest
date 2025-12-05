import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int offset = 20000;
        int[] line = new int[offset];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())+100;
            int b = Integer.parseInt(st.nextToken())+100;
            for(int j=a; j<b; j++) {
                line[j]++;
            }
        }
        for(int i=0; i<offset; i++){
            if(max<line[i]) max = line[i];
        }

        bw.write(String.valueOf(max));
        bw.flush();

    }
}