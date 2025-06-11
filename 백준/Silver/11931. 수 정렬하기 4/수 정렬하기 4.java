import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        // int[] result = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            bw.write(String.valueOf(arr[n-i-1]));
            bw.newLine();
        }
        // for(int i=0; i<n; i++){
        //     result[n-i-1] = arr[i];
        //     bw.write(String.valueOf(result[n-i-1]));
        //     bw.newLine();
        // }
        bw.flush();
        bw.close();
        br.close();
    }
}