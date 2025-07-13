import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] am = new int[1000];
        int[] bm = new int[1000];
        int total = 0;
        for(int i=1; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for(int j=0; j<t; j++){
                am[i] = am[i-1]+v;
            }
            total += v;
        }
        for(int i=1; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for(int j=0; j<t; j++){
                bm[i] = bm[i-1]+v;
            }
        }
        int cnt = 1;
        for(int i=0; i<total; i++){
            if(am[i]<bm[i]) cnt++;
        }


        bw.write(String.valueOf(cnt));
        bw.flush();

    }
}