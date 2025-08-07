import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bucket = new int[n+1];
        for(int t=0; t<m; t++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;
            int k = Integer.parseInt(st.nextToken());
            for(int z=i; z<=j; z++){
                bucket[z] = k;
            }
        }
        for(int i=0; i<n; i++){
            bw.write(bucket[i]+" ");
        }
        bw.flush();
    }
}