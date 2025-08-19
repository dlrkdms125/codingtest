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
        int[] arr = new int[n+1];
        int[] real = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            int number = Integer.parseInt(st.nextToken());
            real[i] = number;
            arr[i] = arr[i-1]+number;
        }
        for(int t=0; t<m; t++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(i!=j) bw.write(String.valueOf(arr[j]-arr[i-1]));
            else bw.write(String.valueOf(real[i]));
            bw.newLine();
        }
        bw.flush();
    }
}