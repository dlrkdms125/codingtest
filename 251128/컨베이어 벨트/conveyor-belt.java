import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] u = new int[201];
        int[] d = new int[201];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            u[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            d[i] = Integer.parseInt(st.nextToken());
        }
        while(t-->0){
            int temp = u[n-1];
            for(int i=n-1; i>=1; i--){
                u[i] = u[i-1];
            }
            u[0] = d[n-1];
            for(int i=n-1; i>=1; i--){
                d[i] = d[i-1];
            }
            d[0] = temp;
        }
        for(int i=0; i<n; i++){
            bw.write(u[i]+" ");
        }
        bw.newLine();
        for(int i=0; i<n; i++){
            bw.write(d[i]+" ");
        }
        bw.flush();
        bw.close();
        
    }
}