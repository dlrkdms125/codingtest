import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            c[i] = Integer.parseInt(st.nextToken());
        }
        while(t-->0){
            int temp1 = a[n-1];
            int temp2 = b[n-1];
            for(int i=n-1; i>=1; i--){
                a[i] = a[i-1];
            }
            for(int i=n-1; i>=1; i--){
                b[i] = b[i-1];
            }
            b[0] = temp1;
            for(int i=n-1; i>=1; i--){
                c[i] = c[i-1];
            }
            c[0] = temp2;
        }
        for(int i=0; i<n; i++){
            bw.write(a[i]+" ");
        }
        bw.newLine();
        for(int i=0; i<n; i++){
            bw.write(b[i]+" ");
        }
        bw.newLine();
        for(int i=0; i<n; i++){
            bw.write(c[i]+" ");
        }
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();

    }
}