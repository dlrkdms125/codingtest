import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bucket = new int[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;  
            int J = Integer.parseInt(st.nextToken()) - 1;  
            while (I < J) {
                int temp = bucket[I];
                bucket[I] = bucket[J];
                bucket[J] = temp;
                I++;
                J--;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(bucket[i] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}