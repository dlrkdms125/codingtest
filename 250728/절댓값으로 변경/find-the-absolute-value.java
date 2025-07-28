import java.util.*;
import java.io.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        cal(arr);
        for(int i=0; i<n; i++){
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }
    private static void cal(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = Math.abs(arr[i]);
        }
        return;
    }
} 