import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        bw.write(min+" "+max);
    
        bw.flush();
        bw.close();
    }
}