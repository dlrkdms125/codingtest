import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] who = new int[1000000];
        int[] a = new int[1000000];
        int[] b = new int[1000000];
        int timea = 1;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while(t-->0) {
                a[timea] = a[timea-1]+v;
                timea++;
            }
        }
        int timeb =1;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            while(t-->0) {
                b[timeb] = b[timeb-1]+v;
                timeb++;
            }
        }
        // a가 리더면 1, b가 리더면 2로 관리
        int leader = 0, answer = 0;
        for(int i=1; i<timea; i++){
            if(a[i]>b[i]) {
                if(leader==2) answer++;
                leader = 1;
            } else if(a[i]<b[i]){
                if(leader==1) answer++;
                leader = 2;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();

    }
}