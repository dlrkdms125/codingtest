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
        for(int i=1; i<=n; i++){
            bucket[i] = i;
        }
        int temp = 0;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            while(start<end){
                temp = bucket[start];
                bucket[start] = bucket[end];
                bucket[end] = temp;
                start++;
                end--;
            }
        }
        for(int i=1; i<=n; i++){
            bw.write(bucket[i]+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}