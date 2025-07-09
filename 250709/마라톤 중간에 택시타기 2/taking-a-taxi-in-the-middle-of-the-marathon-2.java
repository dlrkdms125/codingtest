import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());   
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int  total = 0;
        for(int i=0; i<n-1; i++){
            total += Math.abs(arr[i][0]-arr[i+1][0]) + Math.abs(arr[i][1]-arr[i+1][1]);
        }

        int maxSave = 0;
        for(int i=1; i<n-1; i++){
            int before = Math.abs(arr[i-1][0]-arr[i][0])+Math.abs(arr[i-1][1]-arr[i][1]);
            int after = Math.abs(arr[i][0]-arr[i+1][0])+Math.abs(arr[i][1]-arr[i+1][1]);
            int skip = Math.abs(arr[i-1][0]-arr[i+1][0])+Math.abs(arr[i-1][1]-arr[i+1][1]);
            int save = (before+after)-skip;
            if(save>maxSave) maxSave = save;
        }

        bw.write(String.valueOf(total - maxSave));
        bw.flush();
    }
}