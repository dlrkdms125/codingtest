import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += arr[j] * Math.abs((j-i));
            }
            if(sum<min) min = sum;
        }
        
        bw.write(String.valueOf(min));
        bw.flush();
    }
}