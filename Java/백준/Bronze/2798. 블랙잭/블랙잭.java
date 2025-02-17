import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine() + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = search(arr, n, m);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    static int search(int[] arr, int n, int m){
      int result = 0;
        for (int i = 0; i < n-2; i++) {
            if(arr[i]>m) continue;
            for (int j = i+1; j < n-1; j++) {
                if(arr[i]+arr[j]>m) continue;
                for (int k = j+1; k < n; k++) {
                    int temp = arr[i]+arr[j]+arr[k];
                    if(m==temp) return temp;
                    if(result<temp && temp<m) result = temp;
                }
            }
        }
        return result;
    }
}