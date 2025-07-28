import java.util.*;
import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        isOdd(arr);
        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();

    }
    private static void isOdd(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) {
                arr[i]/=2;
            }
        }
    }
}