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
        a[0] = posa;
        b[0] = posb;

        int timea = 1;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            while(number-->0){
                if(dir=='R') a[timea] = a[timea-1]+1;
                else a[timea] = a[timea-1]-1;
                timea++;
            }
        }
        int timeb = 1;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            char dir = st.nextToken().charAt(0);
            while(number-->0){
                if(dir=='R') b[timeb] = b[timeb-1]+1;
                else b[timeb] = b[timeb-1]-1;
                timeb++;
            }
        }

        if(timea<timeb){
            for(int i=timea; i<timeb; i++){
                a[i] = a[i-1];
            }
        } else {
            for(int i=timeb; i<timea; i++){
                b[i] = b[i-1];
            }
        }

        int cnt = 0;
        int timemax = Math.max(timea, timeb);
        for(int i=1; i<timemax; i++){
            if(a[i]==b[i] && a[i-1]!=b[i-1]) cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        
    }
}