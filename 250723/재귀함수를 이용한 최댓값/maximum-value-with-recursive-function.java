import java.util.*;
import java.io.*;

public class Main {
    static int[] arr = new int[100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(String.valueOf(max(n-1)));
        bw.flush();
        bw.close();
    }
    private static int max(int n){
        if(n==0) return arr[0];
        return Math.max(max(n-1), arr[n]);
    }
}