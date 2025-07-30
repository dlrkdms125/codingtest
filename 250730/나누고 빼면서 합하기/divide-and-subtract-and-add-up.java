import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(String.valueOf(calc(a,m)));
        bw.flush();

    }
    private static int calc(int[] arr, int m){
        int sum = 0;
        int cnt = m;
        while(cnt>=1){
            sum += arr[cnt-1];
            if(cnt%2==0) cnt /= 2;
            else cnt--;
        }
        return sum;
    }
}