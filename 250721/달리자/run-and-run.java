import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[1000];
        int[] b = new int[1000];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        } 
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        } 
        int ans = 0;
        for(int i=0; i<n; i++){
            if(a[i]>b[i]) {
                int num = a[i]-b[i];
                a[i] -= num;
                a[i+1] += num;
                ans += num;
            }
        }
          
        bw.write(String.valueOf(ans));
        bw.flush();


    }
}