import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=0; i<m; i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        int who = 0;
        for(int i=1; i<=n; i++){
            if(arr[i]>=k) {
                who = i;
                break;
            } else {
                who = -1;
            }
            
        }
        bw.write(String.valueOf(who));
        bw.flush();

    }
}