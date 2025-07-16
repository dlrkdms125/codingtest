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
        int answer = -1;
        for(int i=0; i<m; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
            if(arr[num]==k && answer==-1) answer = num;
        }
    
        bw.write(String.valueOf(answer));
        bw.flush();

    }
}