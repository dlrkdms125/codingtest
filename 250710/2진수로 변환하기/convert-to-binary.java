import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 0;

        while(true){
            if(n<2) {
                arr[cnt++]=n;
                break;
            }
            arr[cnt++] = n%2;
            n/=2;
        }
        for(int i=cnt-1; i>=0; i--){
            bw.write(String.valueOf(arr[i]));
        }
        bw.flush();
    }
}