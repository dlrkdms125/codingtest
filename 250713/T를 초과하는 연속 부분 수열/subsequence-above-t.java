import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int cnt = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>t) {
                cnt++;
                if(cnt>max) max = cnt;
            } else {
                cnt = 0;
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();

    }
}