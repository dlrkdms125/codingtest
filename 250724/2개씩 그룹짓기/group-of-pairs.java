import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[2*n];
        for(int i=0; i<2*n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<n; i++){
            int sum = arr[i]+arr[2*n-1-i];
            if(max<sum) max = sum;
        }
        bw.write(String.valueOf(max));
        bw.flush();
    }
}