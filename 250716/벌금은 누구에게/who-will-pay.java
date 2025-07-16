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
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }
        int student = 0;
        for(int i=1; i<=n; i++){
            if(arr[i]>=k) {
                student = i;
                break;
            }
        }
    

        bw.write(String.valueOf(student));
        bw.flush();

    }
}