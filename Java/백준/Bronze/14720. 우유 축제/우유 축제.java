import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        int cur = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==cur){
                cnt ++;
                cur = (cur+1)%3;
            }
        }
        bw.write(cnt+" ");
        bw.flush();
        bw.close();
        br.close();
    }
}
