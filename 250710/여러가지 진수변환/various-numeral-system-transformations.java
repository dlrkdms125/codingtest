import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[32];
        int idx = 0;

        while(n>0) {
            arr[idx++] = n%b;
            n/=b;
        }
        for(int i=idx-1; i>=0; i--){
            bw.write(String.valueOf(arr[i]));
        }
        bw.flush();

    }
}