import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String[][] arr = new String[n][2];
        for(int i=0; i<n; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            arr[i][0] = st1.nextToken();
            arr[i][1] = st1.nextToken();
        }
        // 오름차순 정렬
        Arrays.sort(arr, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        int max = 0;
        for(int x = Integer.parseInt(arr[0][0]); x <= Integer.parseInt(arr[n-1][0]); x++) {
            int sum = 0;
            for(int i=0; i<n; i++) {
                int pos = Integer.parseInt(arr[i][0]);
                if(pos >= x && pos <= x + k) {
                    if(arr[i][1].equals("G")) sum += 1;
                    else if(arr[i][1].equals("H")) sum += 2;
                }
            }
            if(sum > max) max = sum;
        }

        bw.write(String.valueOf(max));
        bw.flush();
    }
}
