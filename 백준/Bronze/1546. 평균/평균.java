import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double[] arr = new double[n];
        double max = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(arr[i]>max) max = arr[i];
        }
        double sum =0;
        for(int i=0; i<n; i++){
            arr[i] = ((arr[i]/max) * 100);
            sum += arr[i];
        }
        double mean = sum/n;
        bw.write(String.valueOf(mean));
        bw.flush();
        bw.close();
        br.close();
    }    
}