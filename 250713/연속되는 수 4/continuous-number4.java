import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 1;
        int cnt = 1;
        for(int i=1; i<n; i++){
            if(arr[i-1]<arr[i]) {
                cnt++;
                if(cnt>max) max = cnt;
            } else {
                cnt = 1;
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        
    }
}