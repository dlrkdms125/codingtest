import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+2; j<n; j++){
                int sum = arr[i]+arr[j];
                if(max<sum) max = sum;
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();


    }
}