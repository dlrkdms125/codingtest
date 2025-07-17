import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
             x1[i] = Integer.parseInt(st.nextToken());
             x2[i] = Integer.parseInt(st.nextToken());
        }
        for(int skip=0; skip<n; skip++){
            int maxStart = Integer.MIN_VALUE;
            int minEnd = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                if(i==skip) continue;
                maxStart = Math.max(maxStart, x1[i]);
                minEnd = Math.min(minEnd, x2[i]);
            }
            if(maxStart<=minEnd) {
                bw.write("Yes");
                bw.flush();
                return;
            }    
        }
        

        bw.write("No");
        bw.flush();
    }
}