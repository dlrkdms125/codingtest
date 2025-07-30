import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int offset = 1000000;
        int size = 2000010;
        int[] a = new int[size];
        int[] b = new int[size];
        int posa = offset;
        int posb = offset;

        int time = 0;
        int maxtime = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            for(int j=0; j<number; j++){
                if(dir=='L') posa--;
                else posa++;
                a[++time]=posa;
            }
            maxtime = Math.max(maxtime, time);
        }
        time = 0;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            for(int j=0; j<number; j++){
                if(dir=='L') posb--;
                else posb++;
                b[++time]=posb;
            }
            maxtime = Math.max(maxtime, time);
        }
        int count = 1;
        for(int i=1; i<=maxtime; i++){
            if(a[i]==b[i] && a[i-1]!=b[i-1]) count++;
        }
        
        bw.write(String.valueOf(count));
        bw.flush();
        
    }
}