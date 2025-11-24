import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arra = new int[n];
        for(int i=0; i<n; i++){
            arra[i] = Integer.parseInt(st.nextToken());
        }
        Integer[] arrb = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arrb[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arra);
        Arrays.sort(arrb, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arra[i]*arrb[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}