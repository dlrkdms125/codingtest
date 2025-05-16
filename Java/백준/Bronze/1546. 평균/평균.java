import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]) max = arr[i];
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]/max * 100;
            sum += arr[i];
        }
        double result = sum/n;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
