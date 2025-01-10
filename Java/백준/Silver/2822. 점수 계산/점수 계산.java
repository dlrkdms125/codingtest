import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[8][2];
        int[] result = new int[5];
        int sum = 0;

        for (int i = 0; i < 8; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i + 1;
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        for (int i = 0; i < 5; i++) {
            sum += arr[i][0];
            result[i] = arr[i][1];
        }

        Arrays.sort(result);

        bw.write(sum + "\n");
        for (int i = 0; i < 5; i++) {
            bw.write(result[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
