import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int answer = 0;
        if(arr[0]+1==arr[1] && arr[1]+1==arr[2]) answer = 0;
        else if(arr[0]+2==arr[1] || arr[1]+2==arr[2]) answer = 1;
        else answer = 2;


        bw.write(String.valueOf(answer));
        bw.flush();

    }
}